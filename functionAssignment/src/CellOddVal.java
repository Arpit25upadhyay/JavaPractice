import java.util.Arrays;

public class CellOddVal {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int oddCount = 0;
        int n = 2;
        int m = 3;
        int[][] mat = new int[n][m];


        for(int[] row: indices){
            int i = 0;
            int j = 0;
            while(i<n){
                mat[i][row[1]]++;
                i++;
            }
             while(j<m){
                 mat[row[0]][j]++;
                 j++;
             }
        }

        for(int[] m1 : mat){
            for(int e : m1) {
                if (e % 2 != 0) {
                    oddCount++;
                }
            }
        }
        System.out.println(oddCount);

    }
}
