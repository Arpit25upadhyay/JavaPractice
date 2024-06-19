import java.util.Arrays;

public class ProductOfSelf {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = arr.length;
        int[] prefixArr = new int[n];
        int[] suffixArr = new int [n];

        prefixArr[0] = 1;

        for(int i = 1; i<n; i++){
            prefixArr[i] = prefixArr[i-1]*arr[i-1];
        }

        suffixArr[n-1] = 1;

        for(int j = suffixArr.length-2; j>=0; j--){
            suffixArr[j] = suffixArr[j+1]*arr[j+1];
        }

        for(int k = 0; k<arr.length; k++){
            arr[k] = prefixArr[k] *suffixArr[k];
        }

        System.out.println(Arrays.toString(prefixArr));
        System.out.println(Arrays.toString(suffixArr));

        System.out.println(Arrays.toString(arr));
    }
}
