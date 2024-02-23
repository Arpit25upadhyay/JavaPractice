import java.util.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[arr[i]-1] != arr[i]){
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
