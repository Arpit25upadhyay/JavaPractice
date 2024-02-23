import java.util.Arrays;

public class BinaySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 89;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] > target){
                cEnd = mid-1;
            }else{
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length; //be cautious, matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = col/2;

        //run the loops till 2 rows wil be remaining
        while (rStart < (rEnd -1)){ //while this is true it will have more than
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] > target){
                rEnd = mid;
            }else{
                rStart = mid;
            }
        }

        //now we have two rows
        // check whether the target is in the col of 2 row

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        //search in 1st half
        if(matrix[rStart][cMid-1] >= target){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in 2nd half
        if(matrix[rStart][cMid+1] <= target && target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart,cMid+1,col-1, target);
        }
        //search in 3rd half
        if(matrix[rStart+1][cMid-1] >= target){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        else{
            return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
        }



    }
}
