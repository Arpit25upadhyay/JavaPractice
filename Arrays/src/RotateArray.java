import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

       // nums = swap(nums, k);

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        nums = swap(nums, k);
    }

    public static int[] swap(int[] nums, int k){
        int n = nums.length;
        int[] temp = new int[n];
        for(int i =0 ; i< n ; i++){
            temp[(i+k)%n] = nums[i];
        }
        return temp;
    }
}
