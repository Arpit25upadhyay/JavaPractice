package Strings;

import java.util.ArrayList;
import java.util.List;

public class DiceProblem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
//        List<List<Integer>> op =  combination(0, arr, target, new ArrayList<>());
//        for(List<Integer> o : op){
//            System.out.println(o);
//        }

//        List<List<Integer>> op =  combinationDuplicate(0, target, new ArrayList<>());
//        for(List<Integer> o : op){
//            System.out.println(o);
//        }

        combinationDuplicate(target, new ArrayList<>());

        System.out.println("Single List-----" + diceCombination("", 4));

    }

//    public static void combination(int i, int[] arr, int target, List<Integer> ans){
//        if(i == arr.length){
//            if(target == 0){
//                System.out.println(ans);
//            }
//            return;
//        }
//
//
//        if(target == 0){
//            System.out.println(ans);
//            return;
//        }
//
//        if(arr[i] <= target){
//            ans.add(arr[i]);
//            combination(i, arr, target-arr[i], ans);
//            ans.remove(ans.size()-1);
//        }
//        combination(++i, arr, target, ans);
//    }

    public static List<List<Integer>> combination(int i, int[] arr, int target, List<Integer> ans){
        List<List<Integer>> res = new ArrayList<>();
        if(i == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(ans));
            }
            return res;
        }


        if(target == 0){
            res.add(new ArrayList<>(ans));
            return res;
        }


        if(arr[i] <= target){
            ans.add(arr[i]);
            res.addAll(combination(i, arr, target-arr[i], ans));
            ans.remove(ans.size()-1);
        }
        res.addAll( combination(++i, arr, target, new ArrayList<>(ans)));

        return res;
    }

    public static void combinationDuplicate(int target, List<Integer> ans){

        if(target == 0){
            System.out.println(ans);
            return;
        }


        for(int n = 1; n<=6; n++) {
            if (n <= target) {
                ans.add(n);
                combinationDuplicate((target - n),ans);
                ans.remove(ans.size()-1);
            }

        }

    }

    public static ArrayList<String> diceCombination(String p, int target){
        ArrayList<String> res =   new ArrayList<>();
        if(target == 0){

            res.add(p);
            return res;
        }

        for (int i = 1; i <= 6; i++) {
            if(target >= i) {
                res.addAll(diceCombination(p + i, target - i));
            }
        }
        return res;
    }

}
