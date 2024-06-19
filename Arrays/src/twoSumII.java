import java.util.ArrayList;
import java.util.List;

public class twoSumII {
    public static void main(String[] args) {
        int[] nums = {-1,0,0,1,2,2,7};
        int target = 1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        int i = 0;
        int j = nums.length-1;
        
        while(i<j){
            //removing duplicate
            if(nums[i] == nums[i+1]){
                i++;
            }
            //removing duplicate
            if(nums[j] == nums[j-1]){
                j--;
            }
            if(nums[i]+nums[j] > target){
                j--;
            } else if (nums[i]+nums[j] < target) {
               i++;
            }
            else{
                ArrayList<Integer> a = new ArrayList<>();
                a.add(nums[i]);
                a.add(nums[j]);
                ans.add(a);
                i++;
                j--;
            }
        }

        for(List l : ans){
            System.out.print(l.toString());
        }
    }
}
