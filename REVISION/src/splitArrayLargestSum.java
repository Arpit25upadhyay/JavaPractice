public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int maxEle = maxEleArr(nums);
        int sum = arrTotal(nums);
        int ans = binarySearch(nums,maxEle,sum,k);
        System.out.println(ans);
    }

    private static int arrTotal(int[] nums) {
        int total = 0;
        for(int n : nums){
            total += n;
        }
        return  total;
    }

    private static int maxEleArr(int[] nums) {
        int max = nums[0];
        for(int n: nums){
            if(n > max){
                max = n;
            }
        }
        return  max;
    }

    public static int binarySearch(int[] nums, int start, int end, int k ){

        while(start<end){
            int mid = start + (end-start)/2;
            int subArrayCount = subArray(nums, mid);

            if(subArrayCount > k){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return start;
    }

    private static int subArray(int[] nums, int mid) {
        int count = 1;
        int sum = 0;
        for(int n : nums){
            sum+=n;
            if(sum > mid){
                sum = n;
                count++;
            }
        }
        return  count;
    }

}

