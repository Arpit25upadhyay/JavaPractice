import java.util.Scanner;

//Define a method to find out if a number is prime or not.
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if(n <=1){
            return false;
        }

        int c = 2;

        while(n>=c*c){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

}
