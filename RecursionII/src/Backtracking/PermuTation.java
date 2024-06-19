package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuTation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        for(List l : permu(new ArrayList<>(),nums)){
            System.out.println(l);
        }
    }

    private static List<List<Integer>> permu(List<Integer> ans, int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            res.add(new ArrayList<>(ans));
            return res;
        }

        for(int i = 0; i<=ans.size(); i++){
            ans.add(i,nums[0]);
            res.addAll(permu(ans, Arrays.copyOfRange(nums, 1, nums.length)));
            ans.remove(i);
        }


        return res;
    }
}
