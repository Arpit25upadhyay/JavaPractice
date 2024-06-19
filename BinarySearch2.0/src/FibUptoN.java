import java.util.Scanner;

public class FibUptoN {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        while(b<=n){
            System.out.println(b);
            int temp = a+b;
            a=b;
            b=temp;
        }



    }
}
