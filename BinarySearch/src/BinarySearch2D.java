import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {15,25,35},
                {27,37,47}
        };

        int target = 101;

        System.out.println(Arrays.toString(BS2DAlgo(arr,target)));
    }

    static int[] BS2DAlgo(int[][] arr, int target){
        int rowStart = 0;
        int colEnd = arr.length-1;

        while (rowStart < arr.length && colEnd >= 0){
            if(arr[rowStart][colEnd] == target){
                return new int[] {rowStart, colEnd};
            }
            if(arr[rowStart][colEnd] > target){
                colEnd--;
            }else{
                rowStart++;
            }
        }
        return new int[]{-1,-1};
    }
}
