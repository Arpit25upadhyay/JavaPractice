import java.util.Scanner;

public class Fib16 {
    public static void main(String[] args) {
        System.out.print("Enter num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        if(n == 0){
            System.out.println(a);
        }else{
            System.out.print(a + " ");
            while(b<=n){
                System.out.print(b+ " ");
                int temp = a+b;
                a = b;
                b = temp;


            }
        }

    }
}
