import java.util.Arrays;

public class SelfProduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] prefixArr = new int[nums.length];

        prefixArr[0] = 1;

        for(int i = 1; i< prefixArr.length; i++){
            prefixArr[i]  = prefixArr[i-1]* nums[i-1];
        }

        int[] suffixArr = new int[nums.length];
        suffixArr[suffixArr.length - 1] = 1;

        for (int i = suffixArr.length-2; i >=0; i--) {
            suffixArr[i] = suffixArr[i+1]* nums[i+1];
        }
        int[] ans = new int[nums.length];
        for(int k = 0; k< nums.length; k++){
            ans[k] = prefixArr[k]*suffixArr[k];
        }

        System.out.println(Arrays.toString(ans));
    }
}
