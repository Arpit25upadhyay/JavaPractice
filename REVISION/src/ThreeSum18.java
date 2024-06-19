import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum18 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        for(List<Integer> l : threeSum(nums)){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if( i!= 0 && nums[i] == nums[i-1]) continue;
            else{
                int target = -nums[i];
                int start = i+1;
                int end = nums.length-1;
                while (start < end) {
                    while (start < end && nums[start] == nums[start + 1])
                        start++;
                    while (start < end && nums[end] == nums[end - 1])
                        end--;
                    int total = nums[start] + nums[end];
                    if (total > target) {
                        end--;
                    } else if(total  <target) {
                        start++;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(-target);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        res.add(temp);
                        start++;
                        end--;
                    }
                }
            }
        }
        return res;
    }

}
