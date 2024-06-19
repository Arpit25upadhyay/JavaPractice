package Strings;

public class GoodNumber {
    static int mod = 1000000007;
    public static void main(String[] args) {
        long n = 50 % mod;

        int ans = (int)(count(0,n)% 1000000007);

        System.out.println(countGoodNumbers(n));
        //System.out.println(ans);
    }

    public static int countGoodNumbers(long n) {
        long evenPos = (n+1)/2;
        long oddPos = n/2;
        long evn = pow(5, evenPos) % mod;
        long odd = pow(4, oddPos) % mod;
        return (int)((evn * odd)%mod);
    }

    public static long pow(long n, long p){
        if(p == 0) return 1;
        long newN = ((n%mod)*(n%mod))%mod;
        long newP = (p/2)%mod;
        if(p%2 == 0) return pow(newN, newP)%mod;
        return (n%mod) * (pow((newN), newP)%mod);
    }

    public static long count(long i, long n){
        long c = 1;
        if(i == n) return c;

        if(i%2 == 0) c = 5;

        if(i%2 != 0) c = 4;

        return c * count(i+1, n);
    }
}
