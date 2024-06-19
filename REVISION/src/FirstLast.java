import java.sql.Array;
import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // ans[0] = binarySearch(nums, target, true);
        // ans[1] = binarySearch(nums, target, false);
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            while(nums[i] != target)i++;
            while(nums[j] != target)j--;
            ans[0] = i;
            ans[1] = j;
            break;
        }

        return ans;
    }
}
