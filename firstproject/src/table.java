import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int T=1;
        while (T <= 10){
            System.out.println(n + " * " + T + " = " + n*T);
            T++;
        }
    }
}
