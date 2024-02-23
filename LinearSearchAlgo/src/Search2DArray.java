import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {9,8,7},
                {11,21,32}
        };
        int n = 0 ;
        System.out.println(Arrays.toString( linear2DSearch(arr, n)));

    }
    static int[] linear2DSearch(int[][] arr, int n){
        for (int i = 0; i< arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] == n){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
