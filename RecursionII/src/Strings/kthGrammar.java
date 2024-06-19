package Strings;

public class kthGrammar {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        System.out.println(findValue(n, k));
    }

    public static int findValue(int n, int k){
        if(n == 1) return 0;

        int totalDigit = (int) Math.pow(2,n-1);
        int mid = totalDigit/2;

        if(k<=mid) return findValue(n-1, k);
        return findValue(n-1, mid-k) ^1;
    }
}
