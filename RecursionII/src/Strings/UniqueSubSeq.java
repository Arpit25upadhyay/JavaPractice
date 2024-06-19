package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSubSeq {
    public static void main(String[] args) {
        String s = "AAB";
        System.out.println(findSubsequences(s));
    }

    public static int findSubsequences(String s) {
        boolean[] status = new boolean[s.length()];
        return findSubsequencesCount(s, status, "").size();
    }

    private static Set<String> findSubsequencesCount(String s, boolean[] Status, String current) {
        Set<String> ansSet = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            if(!Status[i]){
                String newCurrent = current + s.charAt(i);
                ansSet.add(newCurrent);
                Status[i] = true;
                ansSet.addAll(findSubsequencesCount(s,Status, newCurrent));
                Status[i] = false;

            }
        }
        return  ansSet;
    }




}
