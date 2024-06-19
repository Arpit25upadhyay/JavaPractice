import java.util.Arrays;

public class insertionSort {
 public static void main(String[] args) {
   int [] a = {5 };
   sort(a);
   System.out.print(Arrays.toString(a));
 }

 public static void sort(int[] arr){
    for(int i =0; i<arr.length-1; i++){
       for(int j = i+1; j>0; j--){
          if(arr[j] < arr [j-1]){
             swap(arr, j-1, j);
          }else{
           break;
          }
       }
    }
 }

 public static void swap(int[] arr, int idx1, int idx2){
      int temp = arr[idx2];
      arr[idx2] = arr[idx1];
      arr[idx1] = temp;
 }

}
