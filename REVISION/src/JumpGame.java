public class JumpGame {
    public static void main(String[] args) {
        int[]  nums = {2,3,0,0,4};
        boolean unreachable = true;
        int reachable = 0;
        for(int i = 0; i<nums.length; i++){
            if(reachable<i){
                unreachable = false;
                break;
            }
            reachable = Math.max(reachable, i +nums[i]);
        }
        System.out.println(unreachable);
    }
}
