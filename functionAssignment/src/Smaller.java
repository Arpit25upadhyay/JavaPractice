import java.util.Arrays;

public class Smaller {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int c = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[j]< nums[i] && i !=j ){
                    c++;
                }
            }
            ans[i] = c;
            c=0;
        }
        System.out.println(Arrays.toString(ans));
    }
}
