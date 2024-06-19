package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        //System.out.println(Arrays.toString(mergerSort(arr)));
        mergerSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergerSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] leftArr = mergerSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftArr, rightArr);
    }

    public static void mergerSortInPlace(int[] arr, int start, int end){
        if(end-start == 1){
            return;
        }
        int mid = start + (end-start)/2;

        mergerSortInPlace(arr, start, mid);
        mergerSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i< mid && j<end){
            if(arr[i] < arr[j]){
                ans[k++] = arr[i];
                i++;
            }else{
                ans[k++] = arr[j];
                j++;
            }
        }

        while(i<mid){
            ans[k++] = arr[i++];
        }

        while(j<end){
            ans[k++] = arr[j++];
        }

        for(int l = 0 ; l<ans.length; l++){
            arr[start+l] = ans[l];
        }
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]) {
                ans[idx++] = arr1[i];
                i++;
            }
            else {
                ans[idx++] = arr2[j];
                j++;
            }
        }

        while(i<arr1.length){
            ans[idx++]= arr1[i++];
        }
        while(j<arr2.length){
            ans[idx++]= arr2[j++];
        }

        return ans;
    }
}
