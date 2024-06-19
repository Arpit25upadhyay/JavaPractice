public class PeakInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,15},
                {21,30,14},
                {7,16,32}
        };

        int peak = peakElementInMatrix(arr);
        System.out.println(peak);
    }

    private static int peakElementInMatrix(int[][] arr) {
        int start = 0;
        int end = arr[0].length;

        while(start <= end){
            int mid = start + (end-start)/2;
            int maxIdx = maxElementIdx(arr, mid);
            int left = mid > 0 ? arr[maxIdx][mid-1] : -1;
            int right = mid < arr[0].length ? arr[maxIdx][mid+1] : -1;

            if( arr[maxIdx][mid] > left && arr[maxIdx][mid] > right){
                return arr[maxIdx][mid];
            }
            if(arr[maxIdx][mid] < left){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    private static int maxElementIdx(int[][] arr, int mid) {
        int max = arr[0][mid];
        int idx = -1;
        for(int i = 0; i<arr.length; i++ ){
            if(max < arr[i][mid]){
                max = arr[i][mid];
                idx = i;
            }
        }
        return idx;
    }

}
