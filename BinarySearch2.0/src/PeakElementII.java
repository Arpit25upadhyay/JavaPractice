import java.util.Arrays;

public class PeakElementII {
    public static void main(String[] args) {
        int[][] mat = {
                {10,30,40,50,20},
                {1,3,2,500,4}
        };
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i<n; i++){
            int idx = findPeak(mat, i);
            if(n == 1){
                return new int[]{i,idx};
            }
            if(i == 0){
                if(mat[i][idx] > mat[i+1][idx]){
                    return new int[]{i,idx};
                }
            }else if(i == n-1){
                if(mat[i][idx] > mat[i-1][idx]){
                    return new int[]{i,idx};
                }
            }else{
                if(mat[i][idx] > mat[i-1][idx] && mat[i][idx] > mat[i+1][idx]){
                    return new int[]{i,idx};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int findPeak(int[][]mat, int row){
        //if length is 1 only
        if(mat[row].length == 1){
            return 0;
        }
        //first element is peak
        if(mat[row][0] > mat[row][1]){
            return 0;
        }
        //if last element is peak
        if(mat[row][mat[row].length-1] > mat[row][mat[row].length-2]){
            return mat[row].length-1;
        }

        int start = 1;
        int end = mat[row].length-2;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mat[row][mid] > mat[row][mid+1] && mat[row][mid] > mat[row][mid-1]){
                return mid;
            }

            //decreasing curve
            if(mat[row][mid]>mat[row][mid+1]){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
