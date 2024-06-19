package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selSort(arr, 0, arr.length-1, 0);
        //sort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void selSort(int[] arr, int i, int last, int max){
        if(last == 0) return;

        if(i<=last){
            if(arr[i] > arr[max]) max = i;
            selSort(arr,++i, last, max);
        }else{
            swap(arr, max, last);
            selSort(arr,0, --last,0);
        }

    }

    public static void sort(int[] arr, int lastIdx){
        if(lastIdx == 1) return;

        int max = 0;
        for(int i = 0; i<=lastIdx; i++){
             if(arr[i] > arr[max]){
                 max = i;
             }
        }

        swap(arr, max, lastIdx);

        sort(arr, --lastIdx);

    }

    public static void swap(int [] arr, int i, int j){
        int temp  =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
