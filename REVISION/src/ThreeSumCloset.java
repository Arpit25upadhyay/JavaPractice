import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        Arrays.sort(nums);
        int target = 1;
        int sum = closetSum(nums, target);
        System.out.println(sum);
    }

    private static int closetSum(int[] nums, int target) {
        int n = nums.length;
        int res = 0;
        if(n == 3){
            for(int x : nums){
                res+=x;
            }
            return res;
        }
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i<n-2; i++){
            int start = i+1;
            int end = n-1;
            int n1= nums[i];

            while(start < end){
                int total = nums[start]+nums[end]+n1;

                if(diff > Math.abs(total-target)){
                    diff = Math.abs(total-target);
                    res = total;
                }
                else if(total > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;
    }
}
