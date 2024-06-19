import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] a = {3,5,2,1,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){
        int i = 0;
        while (i<a.length-1){
            if(i == a[i]-1){
                i++;
            }else{
                swap(a, i);
            }
        }
    }

    public static void swap(int[] arr, int i){
        int temp = arr[arr[i]-1];
        arr[arr[i]-1] = arr[i];
        arr[i] = temp;
    }
}
