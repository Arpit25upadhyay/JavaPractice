package Easy;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(11,2));
    }

    public static boolean isPrime(int n, int d){

        if(n <= 2){
            return n == 2? true : false;
        }
        if(d*d > n){
            return true;
        }

        if(n%d == 0)return false;

        return isPrime(n, ++d);
    }
}
