import java.util.Arrays;

public class RotateArrayRev {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2,3,4,5,6,7};
        int n = nums.length;
        int[] ans = new int[n];

        k = k%n;
        for(int i = 0; i<n-k; i++){
            ans[i+k] = nums[i];
        }
        for(int i = n-k; i<n; i++){
            ans[i-n+k] = nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
