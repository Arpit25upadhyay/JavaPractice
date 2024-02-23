import java.util.Scanner;

//
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("Enter Power");
        int p = sc.nextInt();

        power(n,p);
    }

    private static void power(int n, int p) {
        int T = 1;
        for(int i = 1; i<=p ; i++){
            T= T * n;
        }
        System.out.println(T);
    }
}
