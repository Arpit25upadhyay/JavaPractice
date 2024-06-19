import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(nums, -294967296));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        //step 1-- sorting
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        //step 2-- fixing i and j
        for(int i = 0; i < n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n; j++){
                if(j>(i+1) && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long total = nums[i];
                    total+=nums[j];
                    total+=nums[k];
                    total+=nums[l];

                    if(total == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[l] == nums[l+1])l--;
                        while(k<l && nums[k]==nums[k-1])k++;
                    }else if(total > target){
                        l--;
                        while(k<l && nums[l] == nums[l+1])l--;
                    }else{
                        k++;
                        while(k<l && nums[k]==nums[k-1])k++;
                    }
                }
            }
        }
        return ans;
    }
}
