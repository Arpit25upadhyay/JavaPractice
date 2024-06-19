package Strings;

public class MonkeyMove {
    static long mod = 1000000007;
    public static void main(String[] args) {
        int n = 3;
        System.out.println(move(n));
    }
    public static int move(int n){
        long ans = power(2,n) % mod;
        ans -= 2;
        return (int)ans;
    }



    public static long power(int n, int p){
        if(p==0) return 1;

        long ans = power(n,p/2);

        if(p%2 == 0){
            return (ans*ans)%mod;
        }
        return n*(ans*ans)%mod;
    }
}
