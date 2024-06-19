package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSubset {
    static ArrayList<String> l = new ArrayList<>();
    public static void main(String[] args) {
        String s = "AAB";
        String ans = "";
        subSet(s, ans);
        //subSet(s,ans,l);
        //System.out.println(l);

        //System.out.println(subSetInternal(s,ans));
        //System.out.println();

        int[] arr = {3,1,2};

        subSeq(0,arr,new ArrayList<>());
    }

    public static void subSet(String s, String ans){
        if(s == ""){
            System.out.println(ans);
            return;
        }

        subSet(s.substring(1), ans+s.charAt(0));
        subSet(s.substring(1), ans);
    }

    public static ArrayList<String> subSet(String s, String ans, ArrayList<String> l){
        if(s == ""){
            l.add(ans);
            return l;
        }


        l = subSet(s.substring(1), ans+s.charAt(0), l);
        l = subSet(s.substring(1), ans, l);

        //l1.addAll(l2);
        return  l;
    }

    public static ArrayList<String> subSetInternal(String s, String ans){
        if(s == ""){
            ArrayList<String> l = new ArrayList<>();
            l.add(ans);
            return l;
        }


        ArrayList<String> l1  = subSetInternal(s.substring(1), ans+s.charAt(0));
        ArrayList<String> l2  = subSetInternal(s.substring(1), ans);

        l1.addAll(l2);
        return  l1;
    }

    public static void subSeq(int idx, int[] arr, List<Integer> ans){
        if(idx >= arr.length){
            System.out.println(ans);
            return;
        }

        ans.add(arr[idx]);
        subSeq(idx+1, arr, ans);
        ans.remove(ans.size()-1);
        subSeq(idx+1, arr, ans);
    }
}
