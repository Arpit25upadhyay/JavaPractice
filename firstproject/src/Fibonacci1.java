import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
//eg 5 :- 0 1 1 2 3 5
//eg 7 : 0 1 1 2 3 5
public class Fibonacci1 {
    public static void main(String[] args) {
        System.out.println("Enter the no. till where you want the fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        if(n == 0) {
            System.out.println(0);
        }
        else{
            System.out.print(a+" ");
            while(b <= n){
                System.out.print(b+" ");
                int next = a+b;
                a=b;
                b=next;
            }
        }
    }
}
