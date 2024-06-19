package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5};
        int[] arr2 = {4,6,2,5,7,9,1,3};
        quickSort(arr, 0, arr.length-1);

        //quickSortII(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int start, int end){
        if(start>=end) return;

        int pivot = start + (end-start)/2;
        int i = start;
        int j = end;

        while(i<=j){
            while(arr[i] < arr[pivot]) i++;

            while(arr[j]> arr[pivot]) j--;

            if(i<=j){
                swap(arr, i, j);
                i++;
                j++;
            }
        }


        quickSort(arr, start, j);
        quickSort(arr, i, end);

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
