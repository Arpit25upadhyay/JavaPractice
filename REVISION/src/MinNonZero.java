public class MinNonZero {
    static long mod = 1000000007;
    public static void main(String[] args) {
        System.out.println(minNonZeroProduct(1));
    }
    public static int minNonZeroProduct(int p) {
        if(p == 1){
            return 1;
        }
        int max = (int)Math.pow(2,p) - 1;

        int a = (int)pow(max-1, p);

        return a * max;
    }

    public static long pow(int n, int p){
        if(p == 0) return 1;

        if(p == 1) return n%mod;
        if(p%2 == 0) return pow(n*n, p/2) %mod;
        return ((n%mod) * pow(n*n, p/2)) %mod;
    }
}
