package Strings;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumRe {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        //find(0, target, new ArrayList<>(), candidates);

        List<List<Integer>> ans=  findII(0, target, new ArrayList<>(), candidates);

        for(List<Integer> l : ans){
            System.out.println(l);
        }
    }

    public static void find(int i, int target, List<Integer> ans, int[] candidates){

        if(i == candidates.length){
            if (target == 0){
                System.out.println(ans);
                return;
            }
        }

        if(target ==0 ){
            System.out.println(ans);
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            if (candidates[j] <= target) {
                ans.add(candidates[j]);
                find(j, target - candidates[j], ans, candidates);
                ans.remove(ans.size() - 1);
            }
        }

    }


    public static List<List<Integer>> findII(int i, int target, List<Integer> ans, int[] candidates){
        List<List<Integer>> res =  new ArrayList<>();
        if(i == candidates.length){
            if (target == 0){
                res.add(ans);
            }
        }



        for (int j = i; j < candidates.length; j++) {
            if (candidates[j] <= target) {
                ans.add(candidates[j]);
                res.addAll(findII(j, target - candidates[j], ans, candidates));
                ans.remove(ans.size() - 1);
            }
        }

        return res;

    }
}
