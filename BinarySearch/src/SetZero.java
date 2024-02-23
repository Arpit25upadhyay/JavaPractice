import java.util.ArrayList;
import java.util.List;

public class SetZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},{3,4,5,2},{1,3,1,5}
        };
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> rowIndex = new ArrayList<Integer>();
        List<Integer> colIndex = new ArrayList<Integer>();

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(matrix[i][j]==0){
                    rowIndex.add(i);
                    colIndex.add(j);
                }
            }
        }

        //update row
        for(int e : rowIndex){
            for(int i = 0 ; i<matrix[0].length; i++){
                matrix[e][i]=0;
            }
        }

        for(int e : colIndex){
            for(int i = 0 ; i<matrix.length; i++){
                matrix[i][e]=0;
            }
        }
    }
}
