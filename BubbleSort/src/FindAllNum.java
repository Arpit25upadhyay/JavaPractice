import java.util.ArrayList;
import java.util.List;

public class FindAllNum {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i<nums.length){
            if(nums[nums[i]-1]!= nums[i]){
                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }

        for(int j =0; j< nums.length; j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }

        return ans;

    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
