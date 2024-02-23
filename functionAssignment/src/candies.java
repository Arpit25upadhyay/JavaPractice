import java.util.Arrays;
import java.util.List;

public class candies {
    public static void main(String[] args) {
        
            int[] candies = {2,3,5,1,3};
            int extraCandies = 3;
            Boolean[] ans = new Boolean[candies.length];

            for(int i = 0; i< candies.length; i++){
                ans[i] = ( isMax(candies, candies[i]+extraCandies));
            }
            System.gc();
        System.out.println( Arrays.asList(ans));
    }


    public static Boolean isMax(int[] candies, int n){
        for(int ele: candies){
            if(n < ele) {
                return false;
            }
        }
        return true;
    }
}
