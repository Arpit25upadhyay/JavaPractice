import java.util.Arrays;

public class FlipImageII {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {1,1,1}
        };

        for(int[] a : flip(image)){
            System.out.println(Arrays.toString(a));
        }
    }

    public static int[][] flip(int[][] image){
        for (int[] arr : image){
            int i = 0;
            int j = arr.length-1;

            while (i<=j){
                int temp = arr[i]^1;
                arr[i] = arr[j]^1;
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return image;
    }
}
