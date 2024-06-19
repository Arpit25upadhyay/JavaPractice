import java.util.Arrays;

public class Freq {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums,k));
    }
//    public static int maxFrequency(int[] nums, int k) {
//        Arrays.sort(nums);
//        int res = 0;
//        for(int i = 0; i<nums.length; i++){
//            res = binarySearch(nums, i, k);
//        }
//        return res;
//    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        long total = 0;
        int start = 0;
        int max = 1;
        for (int end = 1; end < nums.length; end++) {
            total = total + (nums[end] - nums[end - 1]) * (long)(end - start);

            while (total > k) {
                int diff = nums[end] - nums[start];
                total -= diff;
                start++;
            }

            max = Math.max(max, end - start + 1);
            // System.out.println("" + start + " " + end + " - " + total);
        }

        return max;
    }
}
