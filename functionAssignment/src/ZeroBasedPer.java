import java.util.Arrays;

public class ZeroBasedPer {
    public static void main(String[] args) {
        int[] nums  = {0,2,1};
        int[] ans = new int[(nums.length)];

            for(int i = 0; i< nums.length; i++){
                int a = nums[i];
                int b = nums[a];
                ans[i] = nums[nums[i]];
            }

//            int[] ans = new int[(2*(nums.length))];
//        for(int i=0 ; i< (2*(nums.length)); i++){
//            ans[i] = nums[i];
//            ans[i+nums.length] = nums[i];
//        }
        System.gc();
        //return ans;

        System.out.println(Arrays.toString(ans));

        }
    }

