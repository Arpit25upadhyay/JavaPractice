public class CountFreq {
    public static void main(String[] args) {
        int[] arr = {3,6,9};
        int k = 2;
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            ans = Math.max(binarySearch(arr, i, k),ans);
        }
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int targetIdx, int k){
        int start = 0;
        int end = targetIdx;
        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            int windowCount = targetIdx - mid + 1;
            int orgSum = arrSum(arr, mid,targetIdx);
            //int orgSum = prefix[targetIdx] - prefix[mid] + arr[mid];
            int reqOps = (windowCount * arr[targetIdx]) - orgSum;

            if(reqOps <= k){
                ans = windowCount;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }


    public static int arrSum(int[] arr, int i, int j){
        int sum = 0;
        for (int k = i; k <= j ; k++) {
            sum += arr[k];
        }
        return sum;
    }
}
