import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,4};
        Arrays.sort(nums);
        List<List<Integer>> ans = findTriplets(nums);
        for(List l: ans){
            System.out.println(l);
        }
    }

    private static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i< nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            else{
                int start = i+1;
                int end = nums.length-1;
                int target = -nums[i];

                List<List<Integer>> a = new ArrayList<>();
                while (start<end){
                    int total = nums[start];
                    total+= nums[end];
                    if(total == target){
                        List<Integer>temp =new ArrayList<>();
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        temp.add(-target);
                        res.add(temp);
                        start++;
                        end -- ;
                        while (start<end && nums[start] == nums[start-1])start++;
                        while (start<end && nums[end] == nums[end+1])end--;
                    }else if(total > target){
                        end--;
                        while (start<end && nums[end] == nums[end+1])end--;
                    }else{
                        start++;
                        while (start<end && nums[start] == nums[start-1])start++;
                    }
                }
            }

        }
        return res;
    }


}
