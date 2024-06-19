import java.util.Arrays;

public class RotateArrayRevision {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7};
        int k = 8;

        //brute force approach
        //rotate(nums, k);

        //if k> nums.lenght then k=k%nums.length

        k = k %nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        System.out.print(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k){
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int idx =  i+k > nums.length-1 ? (i+k) % nums.length : i+k;
            ans[idx] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, nums.length);
    }

    public static void reverse(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            end--;
            start++;
        }
    }
}
