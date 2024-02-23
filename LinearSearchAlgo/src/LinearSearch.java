import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {2,3,7,11,99};
        int n = 11;
        System.out.println(linearSearch(arr,n));
    }

    static int linearSearch(int[] arr, int n){
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
