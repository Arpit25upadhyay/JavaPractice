import java.util.Arrays;
import java.util.Comparator;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for(int[] ans : flipAndInvertImage(arr)){
            System.out.println(Arrays.toString(ans));
        }
        
    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image){
            reverseAndInvert(row);
        }

        return image;
    }

    public static void reverseAndInvert(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            int temp = (arr[i] ^ 1);
            arr[i] = (arr[j] ^ 1);
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
