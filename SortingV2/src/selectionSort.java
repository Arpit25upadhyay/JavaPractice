import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr = {4,2,1,6,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int [] arr){
        for(int i=0; i< arr.length; i++){
            int maxEleIdx = maxIdx(arr, arr.length-i-1);
            swap(arr,maxEleIdx, arr.length-i-1);
        }
    }

    public static void swap(int[] arr, int maxEleIdx, int n) {
        int temp = arr[maxEleIdx];
        arr[maxEleIdx] = arr[n];
        arr[n] = temp;
    }

    public static int maxIdx(int[] arr, int n) {
        int maxIdx = 0;
        for(int k = 0; k<=n; k++){
            if(arr[k] > arr[maxIdx]){
                maxIdx = k;
            }
        }
        return maxIdx;
    }


}


