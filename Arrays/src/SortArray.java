import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/
public class SortArray {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int p0 = 0, p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int original = nums[i];
            // brush everyone to 2
            nums[i] = 2;
            // if less than 2, brush ptr1 to 1
            if (original <= 1) nums[p1++] = 1;
            // if less than 1, brush ptr0 to 0
            if (original == 0) nums[p0++] = 0;
        }
    }
}
