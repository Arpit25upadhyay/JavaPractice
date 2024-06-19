package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int i){
        if(i == arr.length-1){
            return;
        }
        for(int j = i+1; j>0; j--){
            if(arr[j] < arr[j-1]) swap(arr, j, j-1);
            else break;
        }
        sort(arr, ++i);
    }

    public static void swap(int [] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
