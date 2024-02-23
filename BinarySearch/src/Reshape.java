import java.util.Arrays;

public class Reshape {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2},
                {3,4}
        };
        int r =1;
        int c= 4;
        System.out.println(Arrays.toString( matrixReshape(mat,r,c)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[1][3];
        int[] a = new int[mat[0].length * mat.length];
        int n = mat.length;

        if(r*c == mat[0].length * mat.length){
             for(int i = 0; i< mat.length; i++){
                 for(int j = 0; j < mat[i].length; j++){
                     //2D to 1D
                     a[n*i+j] = mat[i][j];
                 }
             }

             for(int i = 0; i<a.length; i++) {
                 //1D to 2D
                ans[0][i%n] = a[i];
             }




            return ans;
        }

        return mat;
    }
}
