package Strings;

import java.util.List;

//N Digit numbers with digits in increasing order
public class DigitNumber {
    public static void main(String[] args) {
        int n = 1;
        digitCombination("", 0, n);
    }



    public static void digitCombination(String ans, int idx, int n){
        if(ans.length() == n){
            System.out.println(ans);
            return;
        }

        for(int i  = 0; i<=9; i++){
            if(idx == 0 || (ans.charAt(idx-1) - '0') < i){
                digitCombination(ans + i, idx + 1, n);
            }
        }
    }
}
