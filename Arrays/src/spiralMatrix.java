import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix/description/
public class spiralMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {6,7,8,9},
                {10,11,12,24}
        };

        System.out.print(Arrays.toString(spiralOrder(arr)));
    }

    private static int[] spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[] ans = new int[n*m];
        int k = 0;
        int top = 0;
        int left = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;

        while(top <= bottom && left<=right){
            for(int i = left; i<=right; i++){
                ans[k++] = arr[top][i];
            }
            top++;

            for(int i = top; i<=bottom; i++){
                ans[k++] = arr[i][right];
            }
            right--;

            if(!(top <= bottom && left<=right)){
                break;
            }
            for(int i = right; i>=left; i--){
                ans[k++] = arr[bottom][i];
            }
            bottom--;

            for(int i = bottom; i>=top; i--){
                ans[k++] = arr[i][left];
            }
            left++;
        }

        return ans;
    }
}
