package Backtracking;

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        // 2^n * k * log (size of set)
        //HashSet<List<Integer>> outputSet = findCombo(0, candidates, target, new ArrayList<>());

        //System.out.println(outputSet);
        Arrays.sort(candidates);
        List<List<Integer>> op = CombiSum(0, candidates, target, new ArrayList<>());

        for(List<Integer> l : op){
            System.out.println(l);
        }
    }

    public static HashSet findCombo(int idx, int[] arr, int target, List<Integer> ans){
        HashSet<List<Integer>> res = new HashSet<>();
        if(idx >= arr.length){
            if(target == 0){
                res.add(new ArrayList<>(ans));
            }
            return res;
        }

        if(target == 0){
            res.add(new ArrayList<>(ans));
            return res;
        }


        if((arr[idx] <= target)){
            ans.add(arr[idx]);
            res.addAll(findCombo(idx+1, arr, target-arr[idx],ans));
            ans.remove(ans.size() - 1);

        }
        res.addAll( findCombo(idx+1,arr, target, ans));
        return res;
    }


    public static List<List<Integer>> CombiSum(int idx, int[] arr, int target, List<Integer> ans){
        List<List<Integer>> result =  new ArrayList<>();
        if(target == 0){
            result.add(new ArrayList<>(ans));
            return result;
        }

        for(int i = idx; i<arr.length; i++){
            if(i != idx && arr[i] == arr[i-1])continue;
            if(arr[i] > target) break;
            ans.add((arr[i]));
            result.addAll(CombiSum(i+1, arr, target - arr[i], ans));
            ans.remove(ans.size()-1);
        }
        return result;
    }
}
