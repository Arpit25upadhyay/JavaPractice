import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr){
        int n = arr.length;
        boolean swap = false;
        for(int i = 0; i<n-1; i++){
            for(int j = 1; j<n-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

}
