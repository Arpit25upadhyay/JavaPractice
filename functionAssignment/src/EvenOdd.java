import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    private static String check(int n) {
        return n%2 == 0 ? "even" : "odd";
    }
}
