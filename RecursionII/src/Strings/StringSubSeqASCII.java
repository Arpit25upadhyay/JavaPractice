package Strings;

import java.util.ArrayList;

public class StringSubSeqASCII {
    public static void main(String[] args) {
        String s  = "ab";
        String ans = "";
        subSeqII(s,ans);
        System.out.println(subSeq(s, ans));
    }

    private static ArrayList<String> subSeq(String s, String ans) {
        if(s == ""){
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        ArrayList<String> l1 =  subSeq(s.substring(1), ans+s.charAt(0));
        ArrayList<String> l2 =  subSeq(s.substring(1), ans+(s.charAt(0)-0));
        ArrayList<String> l3 =  subSeq(s.substring(1), ans);

        l1.addAll(l2);
        l1.addAll(l3);

        return l1;
    }


    private static void subSeqII(String s, String ans) {
        if(s == ""){

            System.out.println(ans);
            return;
        }

        subSeqII(s.substring(1), ans+s.charAt(0));
        subSeqII(s.substring(1), ans+(s.charAt(0)-0));
        subSeqII(s.substring(1), ans);

    }
}
