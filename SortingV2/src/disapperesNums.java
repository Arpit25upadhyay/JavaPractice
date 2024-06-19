import java.util.ArrayList;
import java.util.List;

public class disapperesNums {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(a));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<nums.length){
            if(nums[nums[i]-1] == nums[i]){
                i++;
            }else{
                swap(nums, i);
            }
        }

        for(int j = 0; j<n; j++){
            if(j != nums[j]-1){
                ans.add(j+1);
            }
        }

        return ans;


    }

    public static void swap(int[] nums, int idx){
        int temp = nums[nums[idx]-1];
        nums[nums[idx]-1] = nums[idx];
        nums[idx] = temp;
    }
}
