import java.util.Scanner;

//Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n  = sc.nextInt();
        int m  = sc.nextInt();
        int o  = sc.nextInt();

        System.out.println(Max(n,m,o));
        System.out.println(Min(n,m,o));
    }

    private static int Max(int n, int m, int o) {
        return Math.max(Math.max(n,m),o);
    }

    private static int Min(int n, int m, int o) {
        return Math.min(Math.min(n,m),o);
    }
}
