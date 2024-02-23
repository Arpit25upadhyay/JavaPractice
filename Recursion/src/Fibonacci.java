//find nth fib no.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    static int fib(int n){
        //base condition
        if(n<2){
            return n;
        }
        //formula fib(n) = fib(n-1)+(fib(n-2)
        return fib(n-1)+fib(n-2);
    }
}