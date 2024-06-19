package Strings;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        String s = "7";
        List<String> ans = findCombination("", s);
        System.out.println(ans);
    }

    private static List<String> findCombination(String s, String num) {
        List<String> ans = new ArrayList<>();
        if(num.isEmpty()) {
            ans.add(s);
            return ans;
        }


        int digit = num.charAt(0)-'0';

        if(digit == 7){
            for(int i = (digit-2)*3; i<=(digit-1)*3; i++){
                char c = (char)('a'+i);
                ans.addAll(findCombination(s+c, num.substring(1)));
            }
        }
        else if(digit == 8){
            for(int i = ((digit-2)*3)+1; i<=(digit-1)*3; i++){
                char c = (char)('a'+i);
                ans.addAll(findCombination(s+c, num.substring(1)));
            }
        }else if(digit == 9){
            for(int i = ((digit-2)*3)+1; i<=((digit-1)*3)+1; i++){
                char c = (char)('a'+i);
                ans.addAll(findCombination(s+c, num.substring(1)));
            }
        }else{
            for(int i = (digit-2)*3; i<(digit-1)*3; i++){
                char c = (char)('a'+i);
                ans.addAll(findCombination(s+c, num.substring(1)));
            }
        }
        return ans;

    }
}
