import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        //brute force
        System.out.println(Arrays.toString(twoSum(nums, target)));


    }
    static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        int start = 0;
        while(start < nums.length-1){
            for(int i=start+1; i< nums.length; i++){
                if(nums[start]+nums[i] == target){
                    ans[0]= start;
                    ans[1]= i;

                    break;
                }
            }
            start++;
        }
        return ans;
    }
}
