import java.util.Arrays;

public class spiralMatrixIII {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int[][] ans = new int[rows*cols][2];
        //0,1,2,3--> E>S>W>N
        int direction = 0;
        int[] d = {0,1,0,-1,0};
        int rStart = 1;
        int cStart = 4;
        int steps = 0;

        int i = 0;
        ans[i++] = new int[]{rStart, cStart};
        while(i< rows*cols){
            if(direction == 0 || direction == 2){
                steps++;
            }
            for(int k = 0; k<steps; k++){
                rStart = rStart+d[direction];
                cStart = cStart+d[direction+1];
                if((rStart>=0 && rStart<rows) && (cStart>=0 && cStart<cols)){
                    ans[i++] = new int[]{rStart, cStart};
                }
            }

            direction = ++direction %4;
        }

        for(int[] a: ans){
            System.out.print(Arrays.toString(a)+" ");
        }


    }
}
