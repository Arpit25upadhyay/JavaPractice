//https://leetcode.com/problems/fair-candy-swap/submissions/982855826/
import java.util.Arrays;

public class FairCandy {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1}, bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotalSum = 0;
        int bobTotalSum = 0;

        for(int n1: aliceSizes){
            aliceTotalSum+=n1;
        }

        for(int n1: bobSizes){
            bobTotalSum+=n1;
        }

        int equalCandies = (aliceTotalSum + bobTotalSum)/2;

        for(int i = 0; i< aliceSizes.length; i++){
            int aliceNeeded = (equalCandies - (aliceTotalSum - aliceSizes[i]));

            if(search(bobSizes, aliceNeeded)){
                return new int[]{aliceSizes[i], aliceNeeded};
            }
        }
        return new int[] {0,0};
    }

    public static boolean search(int[] arr, int target){
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
