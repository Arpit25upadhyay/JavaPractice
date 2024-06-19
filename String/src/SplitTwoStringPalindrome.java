public class SplitTwoStringPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindromeFormation("xbdef", "xecab"));

    }
    public static boolean checkPalindromeFormation(String a, String b) {
        return checkPalindrome(a, b) || checkPalindrome(b, a);
    }

    private static boolean checkPalindrome(String a, String b) {
        int i = 0, j = a.length() - 1;
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


