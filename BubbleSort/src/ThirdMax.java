import java.util.Arrays;
import java.util.HashSet;

public class ThirdMax {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,3,2}));
    }
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int n: nums){
            set.add(n);
        }

        Integer[] sortedArray = set.toArray(new Integer[set.size()]);
        Arrays.sort(sortedArray);
        if(sortedArray.length >=3){
            return sortedArray[sortedArray.length-3];
        }
        return sortedArray[2];
    }
}
