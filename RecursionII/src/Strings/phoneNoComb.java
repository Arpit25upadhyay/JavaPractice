package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class phoneNoComb {
    public static void main(String[] args) {
        String s = "";

        System.out.println(combination(s,""));
    }

    public static ArrayList<String> combination(String s, String ans){
        if(s == ""){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> ansList = new ArrayList<>();
        int digit = s.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char c = (char)('a'+i);
            ansList.addAll(combination(s.substring(1),ans+c));
        }

        return ansList;

    }
}
