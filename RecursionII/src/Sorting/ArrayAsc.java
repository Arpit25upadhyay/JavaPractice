package Sorting;

public class ArrayAsc {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        System.out.println(checkArrII(arr, 0));
    }

    public static boolean checkArr(int[] arr, int i){
        if(i == arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;
        return checkArr(arr,++i);
    }

    public static boolean checkArrII(int[] arr, int i){
        if(i == arr.length-1) return true;
        //if(arr[i] > arr[i+1]) return false;
        return arr[i] < arr[i+1] && checkArr(arr,++i);
    }


}
