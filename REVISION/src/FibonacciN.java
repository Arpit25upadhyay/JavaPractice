import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class FibonacciN {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.print(0);
        }
        else{
            int a = 0;
            int b = 1;
            System.out.print(a + " ");
            while(b<=n){
                System.out.print(b +" ");
                int temp = a+b;
                a = b;
                b = temp;
            }
        }
    }

}
