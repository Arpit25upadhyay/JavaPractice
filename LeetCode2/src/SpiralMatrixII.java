import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {

        for(int[]a : generateMatrix(3)) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;

        int num = 0;

        while(top<=bottom && left <=right)
        {
            //left->right
            for(int i  = left; i<=right; i++){
                res[top][i] = ++num;
            }
            top++;

            //top->bottom
            for(int i = top; i<= bottom; i++){
                res[i][right] = ++num;
            }
            right--;

            //right->left
            for(int i = right; i>=left; i--){
                res[bottom][i] = ++num;
            }
            bottom--;

            //bottom->top
            for(int i =bottom; i>=top; i--){
                res[i][left] = ++num;
            }
            left++;
        }

        return res;
    }
}

