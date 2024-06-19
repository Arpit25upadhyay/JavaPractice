public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumDigit(n));
        System.out.println(prodDigit(n));
    }

    private static int sumDigit(int n) {
        if(n == 0){
            return 0;
        }
        int r = n%10;
        return sumDigit(n/10) + r;

    }

    private static int prodDigit(int n){
        if(n == 0){
            return 1;
        }

        return (n%10) * prodDigit(n/10);
    }
}
