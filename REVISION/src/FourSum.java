import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        Arrays.sort(nums);
        
        for(List<Integer> l : fourSum(nums, target)){
            System.out.println(l);
        }
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length-1; j++){
                if(j!=(i+1) && nums[j] == nums[j-1]) continue;
                int n1 = nums[i];
                int n2 = nums[j];
                int start = j+1;
                int end = nums.length-1;

                while(start<end){
                    int total = n1;
                    total += n2;
                    total += nums[start];
                    total += nums[end];

                    if(total > target){
                        end--;
                        while(start < end && nums[end] == nums[end+1]) end--;
                    }else if(total < target){
                        start++;
                        while(start < end && nums[start] == nums[start-1]) start++;
                    }else{
                        List<Integer> l = new ArrayList<>();
                        l.add(n1);
                        l.add(n2);
                        l.add(nums[start]);
                        l.add(nums[end]);
                        res.add(l);
                        start++;
                        end--;
                        while(start < end && nums[start] == nums[start-1]) start++;
                        while(start < end && nums[end] == nums[end+1]) end--;
                    }
                }
            }
        }
        return res;
    }
}
