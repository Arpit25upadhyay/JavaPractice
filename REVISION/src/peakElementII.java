import java.util.Arrays;

public class peakElementII {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,15},
                {21,30,14},
                {7,16,32}
        };
        int m = mat.length - 1;
        int n = mat[0].length - 1;

        System.out.print(Arrays.toString(binarySearch(mat, m, n)));
    }

    public static int[] binarySearch(int[][] arr, int row, int col){
        int[] res = {-1,-1};
        int start = 0;
        int end = col;

        while (start <=end){
            int mid = start + (end-start)/2;
            int maxRow = maxEle(arr, mid);
            int leftEle = maxRow > 0 ? arr[maxRow][mid-1] : -1;
            int rightEle = maxRow < col ? arr[maxRow][mid+1] : -1;

            if(arr[maxRow][mid] > leftEle && arr[maxRow][mid] > rightEle){
                res[0] = maxRow;
                res[1] = mid;
                return res;
            }
            if(arr[maxRow][mid] < leftEle){
                end = mid-1; ///left side bdi hai///
            }else{
                start = mid+1; ///right side bdi hai///
            }
        }
        return res;

    }

    private static int maxEle(int[][] arr, int mid) {
        int maxIdx = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[maxIdx][mid] < arr[i][mid]){
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
