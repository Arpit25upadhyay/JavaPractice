//Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter from");
        int n  = sc.nextInt();
        System.out.println("Enter to");
        int m  = sc.nextInt();

        primeRange(n,m);
    }

    private static void primeRange(int n, int m) {
        for(int i = n; i<=m; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    private static boolean isPrime(int i) {
        int c = 2;
        while (i >= c*c){
            if (i%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
