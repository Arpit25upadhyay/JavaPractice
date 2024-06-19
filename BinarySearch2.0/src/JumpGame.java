public class JumpGame {
    public static void main(String[] args) {
        int []a = {3,2,1,0,4};
        System.out.println(isReachable(a));
    }

    private static boolean isReachable(int[] a) {
        int reachable =0;

        for(int i = 0; i<a.length; i++){
            if(reachable<i ){
                return false;
            }
            reachable = Math.max(reachable, i+a[i]);
        }
        return true;
    }

}
