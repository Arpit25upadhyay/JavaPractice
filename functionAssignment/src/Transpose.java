import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = matrix.length;
        int m=matrix[0].length;

        int[][] T = new int[m][n];
        for(int i = 0 ; i< T.length; i++){
            for (int j = 0; j<T[i].length; j++){
                T[i][j] = matrix[i+j-i][i+j-j];
            }
        }

        for (int [] e:T) {
            System.out.println(Arrays.toString(e));
        }
    }
}
