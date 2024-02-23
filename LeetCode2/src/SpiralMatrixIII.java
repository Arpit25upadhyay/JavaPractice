import java.util.Arrays;

public class SpiralMatrixIII {
    public static void main(String[] args) {
        for(int[]a : spiralMatrixIII(5,6,1,4)) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows*cols][2];
        int i = 0;
        res[i++] = new int[]{rStart,cStart};
        int d = 0; //0  = east,1 = south,2 = west,3 = north
        int[] directions = new int[]{0,1,0,-1,0};
        int step  = 0;
        while(i < rows*cols){
            if(d == 0 || d == 2){
                step++;
            }

            for(int k = 0 ; k < step; k++){
                rStart += directions[d];
                cStart += directions[d+1];
                if(rStart < rows && rStart>=0 && cStart < cols && cStart>=0 ){
                    res[i++] =new int[]{rStart, cStart};
                }
            }

            d = ++d % 4;
        }

        return res;
    }
}
