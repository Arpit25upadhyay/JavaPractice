public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,0,1,0}));
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        if(nums.length == 1){
            return true;
        }
        if(nums[0] == 0){
            return false;
        }

        int i = 0;
        for (int reach = 0; i < n && i <= reach; ++i){
            reach = Math.max(i + nums[i], reach);
        }

        return i == n;
    }
}
