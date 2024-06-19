package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,8};
        //sort(arr, arr.length);
        bubbleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int n){
        if(n == 1) return;

        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]) swap(arr, i, i+1);
        }

        sort(arr, --n);
    }

    public static void bubbleSort(int[] arr, int i, int lastIdx){
        if(lastIdx == 0) return;


        if(i < lastIdx){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
            }
            bubbleSort(arr, i+1, lastIdx);
        }
        else{
            bubbleSort(arr, 0, lastIdx-1);
        }
    }
    public static void swap(int [] arr, int i, int j){
        int temp  =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
