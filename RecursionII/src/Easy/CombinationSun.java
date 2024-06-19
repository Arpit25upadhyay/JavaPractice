package Easy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSun {
    static List<List<Integer>> res= new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        //res = combinationSum(arr, 7);
        for(List<Integer> l : combinationSum(arr, 7)){
            System.out.println(l);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        combination(candidates, 0, target, new ArrayList<>());
        return res;
    }

    public static void combination(int[] arr, int i, int target, List<Integer> combi){
        if(i == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(combi));
            }
            return;
        }

        if(target == 0){
            res.add(new ArrayList<>(combi));
            return;
        }


        if(target >= arr[i]){
            combi.add(arr[i]);
            combination(arr, i, target - arr[i], combi);
            combi.remove(combi.size()-1);
        }
        combination(arr, i+1, target, combi);

    }
}
