package Strings;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candi = {2,3,6,7};
        //combination(0,candi,7, new ArrayList<>());
        List<List<Integer>> ans =combination(0,candi,7,new ArrayList<>());
        for(List<Integer> a  : ans){
            System.out.println(a);
        }
    }

//    public static void combination(int idx, int[] arr, int target, List<Integer> ans){
//        if(idx == arr.length){
//            if(target == 0){
//                System.out.println(ans);
//            }
//            return;
//        }
//
//        if(target == 0){
//            System.out.println(ans);
//            return;
//        }
//
//
//        if(target>= arr[idx]){
//            ans.add(arr[idx]);
//            combination(idx, arr, target - arr[idx], ans);
//            ans.remove(ans.size()-1);
//        }
//        combination(++idx, arr, target, ans);
//
//
//    }


    public static List<List<Integer>> combination(int idx, int[] arr, int target, List<Integer> ans){
        if(idx == arr.length){
            List<List<Integer>> abc = new ArrayList<>();
            if(target == 0){
                abc.add(new ArrayList<>(ans));
            }
            return abc;
        }

        List<List<Integer>> abc = new ArrayList<>();
        if(target == 0){
            abc.add(new ArrayList<>(ans));
            return abc;
        }

        if(arr[idx] <= target){
            ans.add(arr[idx]);
            abc.addAll(combination(idx, arr, target-arr[idx], ans ));
            ans.remove(ans.size()-1);
        }
        abc.addAll(combination(++idx, arr, target, new ArrayList<>(ans)));


        return abc;
    }
}
