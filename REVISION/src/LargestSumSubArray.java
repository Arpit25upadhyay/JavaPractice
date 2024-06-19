public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] arr ={7,2,5,10,8};
        int k = 2;
        int maxEle = maxEleInArr(arr);
        int total = totalSumofArr(arr);

        int ans = binarySearch(arr, maxEle, total, k );

        System.out.println(ans);

    }

    public static int maxEleInArr(int[] arr) {
        int max = arr[0];
        for(int n :arr){
            max = Math.max(max,n);
        }
        return max;
    }

    public static int totalSumofArr(int[] arr) {
        int sum = 0;
        for(int n : arr){
            sum +=n;
        }
        return sum;
    }

    private  static int binarySearch(int[]arr, int start, int end, int k){
        while(start<end){
            int mid = start+(end-start)/2;

            int subArrayCount = subArray(arr, mid);

            if(subArrayCount <= k){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    private static int subArray(int[] arr, int mid) {
        int sum = 0;
        int count = 1;
        for(int n : arr){
            sum += n;
            if(sum>mid){
                sum = n;
                count++;
            }
        }
        return count;
    }
}
