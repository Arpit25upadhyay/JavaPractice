import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] mat = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//                {10,11,12}
//        };

        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[] ans = readSpiralMat(mat);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] readSpiralMat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] res = new int[n*m];

        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = m-1;
        int idx = 0;
        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                res[idx++] = mat[top][i];
            }
            top++;

            for(int i = top; i<=bottom; i++){
                res[idx++] = mat[i][right];
            }
            right--;

            if(!(top<=bottom && left<=right)){
                break;
            }

            for(int i = right; i>=left; i--){
                res[idx++] = mat[bottom][i];
            }
            bottom--;

            for(int i = bottom; i>=top; i--){
                res[idx++] = mat[i][left];
            }
            left++;
        }
        return res;
    }
}
