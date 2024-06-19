package Strings;

public class PowOfXN {
    public static void main(String[] args) {
        System.out.println(myPow(0.00001,2147483647));
    }
    public static double myPow(double x, int n) {
        return powFun(x, n);
    }

    public static double powFun(double x, long n){
        if(n == 0) return 1;

        if(n<0) return  powFun(1/x, -n);

        if(n %2 == 0){
            return powFun(x * x, n/2);
        }else{

            return x* powFun(x*x, n/2);
        }

    }
}
