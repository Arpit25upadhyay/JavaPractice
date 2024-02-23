//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkPalindrome(s.toLowerCase()));

    }

    public static String checkPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return "Not Palindrome";
            }
        }
        return "Palindrome";
    }
}
