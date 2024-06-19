package Easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        System.out.println(reverse(n));
        String str = "mukesh";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }

    public static boolean reverse(int n){
        int digits = (int) (Math.log10(n))+1;
        return (n == helper(n, digits));
    }

    public static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        return (n%10) * (int)(Math.pow(10,digits-1)) + helper(n/10, --digits);
    }

    public static boolean isPalindrome(String str, int s, int e){
        while (s <= e){
            if(str.charAt(s) == str.charAt(e)){
                isPalindrome(str , ++s, --e);
            }else {
                return false;
            }
        }
        return true;
    }
}
