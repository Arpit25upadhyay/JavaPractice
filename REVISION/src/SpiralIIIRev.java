import java.util.Arrays;

public class SpiralIIIRev {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(spiralMatrixIII(5,6,1,4)));
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        int d = 0;
        int[] direction = {0,1,0,-1,0};
        int idx = 0;
        ans[idx++] = new int[]{rStart  , cStart};
        int steps = 0;
        while(idx < rows*cols){
            if(d == 0 || d == 2){
                steps++;
            }

            for(int k = 0; k<steps; k++){
                rStart = rStart+direction[d];
                cStart = cStart+direction[d+1];
                if(0<= rStart && 0<= cStart && rStart< rows && cStart< cols){
                    ans[idx++] = new int[]{rStart, cStart};
                }
            }

            d  = ++d;
            d = d%4;

        }

        return ans;
    }
}
