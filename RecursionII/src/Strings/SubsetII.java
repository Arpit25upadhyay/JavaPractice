package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetII {
    public static void main(String[] args) {
        int[] arr  =  {1,2,2};
        //Set<List<Integer>> ans = subSet(0, arr, new ArrayList<>());
        //List<List<Integer>> result = new ArrayList<>();
        //subSetOptimize(0,arr, new ArrayList<>(), result);
        List<List<Integer>> result = subSetOptimizeII(0,arr, new ArrayList<>());
        for(List l : result){
            System.out.println(l);
        }
    }

    public static Set<List<Integer>> subSet(int i, int[] arr, List<Integer> ans){
        Set<List<Integer>> res = new HashSet<>();
        if(i == arr.length){
            res.add(new ArrayList<>(ans));
            return res;
        }
        ans.add(arr[i]);
        res.addAll(subSet(i+1, arr, ans));
        ans.remove(ans.size()-1);
        res.addAll(subSet(i+1, arr, ans));
        return res;
    }

    public static void subSetOptimize(int idx, int[] arr, List<Integer> ans, List<List<Integer>> result){
        result.add(new ArrayList<>(ans));
        for(int i = idx; i< arr.length; i++){

            if(i!= idx && arr[i] == arr[i-1]) continue;
            ans.add(arr[i]);
            subSetOptimize(i+1, arr, ans, result);
            ans.remove(ans.size()-1);
        }
    }


    public static List<List<Integer>> subSetOptimizeII(int idx, int[] arr, List<Integer> ans){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(ans));

        for(int i = idx; i< arr.length; i++){
            if(i!= idx && arr[i] == arr[i-1]) continue;
            ans.add(arr[i]);
            result.addAll(subSetOptimizeII(i+1, arr, ans));
            ans.remove(ans.size()-1);
        }
        return result;
    }

}
