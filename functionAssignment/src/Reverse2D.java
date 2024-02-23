import java.util.Arrays;

public class Reverse2D {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
        {1,0,1},
        {0,0,0}
        };
        int[][] ans = new int[image.length][image.length];

        for(int i = 0 ; i <image.length; i++){
            int n = image.length;
            for(int j =0; j<image.length; j++){
                ans[i][j] = image[i][n-1] ==0 ?1:0 ;
                n--;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
