package Easy;

import java.util.Arrays;

public class SumOfTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        triangleSum(arr);
    }
    public static void triangleSum(int[] arr){
        if(arr.length < 1){
            return;
        }
        int[] newArr = new int[arr.length -1];
        for(int i = 0; i<arr.length-1; i++){
            newArr[i] = arr[i] + arr[i+1];
        }
        triangleSum(newArr);
        System.out.println(Arrays.toString(arr));

    }
}
