import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            //fint the max item in the remaining array and swap with correct idx
            int last = n-i-1;
            int maxIdx = maxIndex(arr, last);
            swapMaxIdx(arr,last, maxIdx);
        }
    }

    private static void swapMaxIdx(int[] arr, int last, int maxIdx) {
        int temp=arr[maxIdx];
        arr[maxIdx] = arr[last];
        arr[last] = temp;
    }

    static int maxIndex(int[] arr, int last){
        int max = 0;
        for(int i = 0; i <= last; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
