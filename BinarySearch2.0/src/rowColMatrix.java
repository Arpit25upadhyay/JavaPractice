import java.util.Arrays;

//if array is sorted row and col wise
public class rowColMatrix {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,15}
        };
        System.out.println(Arrays.toString(searchInMatrix(arr,8)));
    }

    public static int[] searchInMatrix(int[][] arr, int target){
        int rStart = 0;
        int cEnd = arr.length-1;

        while(rStart<arr.length && cEnd>=0){
            if(arr[rStart][cEnd] == target){
                return new int[]{rStart, cEnd};
            }
            if(arr[rStart][cEnd] < target){
                rStart++;
            }else{
                cEnd--;
            }
        }
        return new int[]{-1,-1};
    }
}
