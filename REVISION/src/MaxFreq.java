import java.util.Arrays;

public class MaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int[] prefixArr = new int[nums.length];
        prefixArr[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            prefixArr[i] = prefixArr[i-1] + nums[i];
        }

        int ans = -1;
        for(int i = 0 ; i< nums.length; i++){
            ans = Math.max(ans, binarySearch(nums, i, k, prefixArr));
        }
        return ans;
    }

    public static int binarySearch(int[] nums, int targetIdx, int k, int[] prefixArr){
        int start = 0;
        int end =  targetIdx;
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int windowCount = targetIdx - mid +1;

            int orgSum = prefixArr[targetIdx] - prefixArr[mid] + nums[mid];
            int reqOps = (windowCount * nums[targetIdx]) - orgSum;

            if(reqOps<= k){
                ans = windowCount;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }



}
