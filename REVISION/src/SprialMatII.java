import java.util.Arrays;

public class SprialMatII {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        int val = 1;
        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                ans[top][i] = val++;
            }
            top++;

            for(int i = top; i<=bottom; i++){
                ans[i][right] = val++;
            }
            right--;

            if(!(top<=bottom && left<=right)) break;

            for(int i = right; i>=left; i--){
                ans[bottom][i] = val++;
            }
            bottom--;

            for(int i = bottom; i>=top; i--){
                ans[i][left] = val++;
            }
            left++;
        }
        return ans;
    }
}

