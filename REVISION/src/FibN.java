import java.util.Scanner;

public class FibN {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 0; i<=n; i++){
//            System.out.println(fibonacciFormula(i));
//        }
        int i = 0;
        while(n>= fibonacciFormula(i)){
            System.out.println(fibonacciFormula(i));
            i++;
        }
    }

    private static int fibonacciFormula(int n) {
        double a = Math.pow ((1+Math.sqrt(5))/2, n);
        double b = Math.pow ((1-Math.sqrt(5))/2, n);

        return (int)((a-b)/Math.sqrt(5));
    }
}
