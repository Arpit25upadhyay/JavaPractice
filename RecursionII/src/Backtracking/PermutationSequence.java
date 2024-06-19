package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        int n = 4;

        for(List l : findPermutation(n, new ArrayList<>())){
            System.out.println(l);
        }
    }

    public static List<List<Integer>> findPermutation(int n, List<Integer> ans){
        List<List<Integer>> res =  new ArrayList<>();
        if(ans.size() == n){
            res.add(new ArrayList<>(ans));
            return res;
        }

        for (int k = 1; k <= n; k++) {
            if (!ans.contains(k)) { // Ensure k is not already present in ans
                ans.add(k);
                res.addAll(findPermutation(n, ans));
                ans.remove(ans.size() - 1); // Remove the last element after exploring permutations
            }
        }

        return res;
    }
}
