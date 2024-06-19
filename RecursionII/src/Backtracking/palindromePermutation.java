package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class palindromePermutation {
    public static void main(String[] args) {
        String s = "aab";
        for(List l : partition(s)){
            System.out.println(l);
        }
    }
    public static List<List<String>> partition(String s) {
        return palindromePart(0, s, new ArrayList<>());
    }

    public static List<List<String>> palindromePart(int idx, String s, List<String> ans){
        List<List<String>> res = new ArrayList<>();
        if(idx == s.length()){
            res.add(new ArrayList<>(ans));
            return res;
        }

        for(int i = idx; i<s.length(); i++){
            if(isPalindrome(s, idx, i)){
                ans.add(s.substring(idx, i+1));
                res.addAll(palindromePart(i+1, s, ans));
                ans.remove(ans.size()-1);
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
