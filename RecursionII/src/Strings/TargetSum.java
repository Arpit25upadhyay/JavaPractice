package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(noOfWaysII(0,0, target));

    }

    public static int noOfWays(int[] nums, int index, int sum, int target){
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        int waysWithPlus = noOfWays(nums, index + 1, sum + nums[index], target);
        int waysWithMinus = noOfWays(nums, index + 1, sum - nums[index], target);

        return waysWithPlus + waysWithMinus;
    }

    public static int noOfWaysII(int index, int sum, int target){
        if (index == 5) {
            return sum == target ? 1 : 0;
        }

        int waysWithPlus = noOfWaysII(index + 1, sum + 1, target);
        int waysWithMinus = noOfWaysII(index + 1, sum - 1, target);

        return waysWithPlus + waysWithMinus;
    }


    public static List<List<Integer>> subSetDuplicatesII(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        for(int j = 0; j< arr.length; j++){
            int len  = res.size();
            if(j>0 && arr[j] == arr[j-1]) {
                for(int i = len/2 ; i<len; i++){
                    List<Integer> internal = new ArrayList<>(res.get(i));
                    internal.add(arr[j]);
                    res.add(internal);
                }
            }
            else {
                for (int i = 0; i < len; i++) {
                    List<Integer> internal = new ArrayList<>(res.get(i));
                    internal.add(arr[j]);
                    res.add(internal);
                }
            }
        }
        return res;
    }
}
