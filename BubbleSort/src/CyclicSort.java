import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        int i = 0;
        while(i<arr.length){
            if(arr[i] != i+1){
                swap(arr,i, arr[i]-1);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
