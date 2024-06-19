public class GCD_Recursion {
    public static void main(String[] args) {
        System.out.println(gcd(12,24));
    }
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
