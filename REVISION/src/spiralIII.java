import java.util.Arrays;

public class spiralIII {
    public static void main(String[] args) {

        for(int[] arr : spiralMatrixIII(5,6,1,4)){
            System.out.println(Arrays.toString(arr));
        }

    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2];
        int i = 0;
        res[i++] = new int[] { rStart, cStart };
        int directn = 0; // 0,1,2,3 //e s w n
        int[] d = { 0, 1, 0, -1, 0 };
        int steps = 0;
        while (i < rows * cols) {
            if (directn == 0 || directn == 2) {
                steps++;
            }
            for (int k = 0; k < steps; k++) {
                rStart += d[directn];
                rStart += d[directn + 1];

                if(rStart < rows && rStart>=0 && cStart < cols && cStart>=0 ){
                    res[i++] =new int[]{rStart, cStart};
                }
            }

            directn = ++directn % 4;

        }

        return res;
    }
}
