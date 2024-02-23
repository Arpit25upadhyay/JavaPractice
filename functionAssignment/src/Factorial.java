import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
       int f =1;
        while(n>1){
            f = f*n;
            n--;
        }
        return f;
    }
}
