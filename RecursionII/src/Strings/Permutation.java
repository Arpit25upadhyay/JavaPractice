package Strings;

import java.util.ArrayList;

public class Permutation {
    static ArrayList<String> mm = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        //permutation(s, ans);
        //System.out.println(permutation(s,ans));
        System.out.println(permutationWithList(s,ans));
        System.out.println(noOfPermutation(s, ans));
    }

    public static void permutation(String s, String ans){
        if(s == ""){
            //ArrayList<String> l = new ArrayList<>();
            //l.add(ans);
            System.out.println(ans);
            return;
        }

        for(int i = 0; i< ans.length()+1; i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i);
            permutation(s.substring(1),first + s.charAt(0) + second);
        }

    }



    public static ArrayList<String> permutationWithList(String s, String ans){
        if(s == ""){
            ArrayList<String> l = new ArrayList<>();
            l.add(ans);
            return l;
        }
        ArrayList<String> pList = new ArrayList<>();
        for(int i = 0; i< ans.length()+1; i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i);
            pList.addAll(permutationWithList(s.substring(1),first + s.charAt(0) + second));
        }

        return pList;

    }



    public static int noOfPermutation(String s, String ans){
        if(s == ""){
            return 1;
        }
        int count = 0;
        for(int i = 0; i< ans.length()+1; i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i);
            count += noOfPermutation(s.substring(1),first + s.charAt(0) + second);
        }
        return count;

    }
}
