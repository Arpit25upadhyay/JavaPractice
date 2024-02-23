import java.util.ArrayList;
import java.util.List;

public class Spiralmatix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println(spiralOrder(matrix));

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>() ;

        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length-1;

        while(top<=bottom && left<=right){
            for(int i = left; i<= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int j = top; j<=bottom; j++){
                ans.add(matrix[j][right]);
            }
            right--;
            if(!(left<=right && top<=bottom)){
                break;
            }

            for(int k = right; k>= left; k--){
                ans.add(matrix[bottom][k]);
            }
            bottom--;
            for(int l = bottom; l>= top; l--){
                ans.add(matrix[l][left]);
            }
            left++;
        }

        return ans;



    }
}
