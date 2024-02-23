//https://leetcode.com/problems/valid-palindrome/
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder a = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }


        int i = 0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
