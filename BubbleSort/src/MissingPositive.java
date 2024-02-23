import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,1}));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i< nums.length){
            //Ignore all the negative
            if(nums[i] != nums[nums[i]-1] && nums[i]>0 && nums[i] <= nums.length){
                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }

    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
