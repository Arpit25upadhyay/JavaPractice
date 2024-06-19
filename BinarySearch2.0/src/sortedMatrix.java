import java.util.Arrays;

//Matrix is strictly sorted
public class sortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int t = 11;

        System.out.println(Arrays.toString(search(arr,12)));
    }

    public static int[] binarySearch(int [][]arr, int target, int start, int end, int row){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[row][mid] == target){
                return new int[]{row, mid};
            }if(arr[row][mid]>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }



    //searches in middle column
    public static int[] search(int[][] arr, int t) {
        int row = arr.length;
        int col = arr[0].length;

        if(row==1){
            return binarySearch(arr,t,0,col-1,0);
        }

        int midCol = col/2;

        int sRow = 0;
        int eRow = row-1;
        //search till 2 rows left
        while(sRow<(eRow-1)){
            if(arr[sRow][midCol] == t){
                return new int[]{sRow,midCol};
            }if(arr[sRow][midCol]>t){
                eRow--;
            }else {
                sRow++;
            }
        }
        //perform BS in remaining arr
        //search in first half
        if(t <= arr[sRow][midCol-1]){
            return binarySearch(arr,t,0,midCol-1,sRow);
        }
        //search in second half
        if(t >= arr[sRow][midCol+1]){
            return binarySearch(arr,t,midCol+1,col-1,sRow);
        }
        //search in third half
        if(t <= arr[sRow+1][midCol-1]){
            return binarySearch(arr,t,0,midCol-1,sRow+1);
        }
        //search in forth half
        else{
            return binarySearch(arr,t,midCol+1,col-1,sRow+1);
        }
    }
}
