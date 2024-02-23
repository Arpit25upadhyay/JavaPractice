import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciRange(n);

    }

    public static void FibonacciRange(int n) {
        int i = 0;
        int j = 1;
        int temp = i+j;

        if(n == 0){
            System.out.println(i);
        }
        else{
            System.out.println(i);
            while(n >= j){
                System.out.println(j);
                temp = i+j;
                i = j;
                j = temp;

            }
        }

    }
}
