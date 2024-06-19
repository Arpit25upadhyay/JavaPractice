import java.util.ArrayList;

public class SpiralMatrixRev {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println(spiralPath(mat));
    }

    private static ArrayList spiralPath(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;

        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                ans.add(mat[top][i]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                ans.add(mat[i][right]);
            }
            right--;

            if(!(top<=bottom && left<=right)) break;

            for(int i = right; i>= left; i--){
                ans.add(mat[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i>=top; i--){
                ans.add(mat[i][left]);
            }
            left++;

        }
        return ans;

    }
}
