package Easy;

import java.util.Scanner;

public class SpecialFIbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long n = scanner.nextLong();


            long result = splFibo(n, a, b);
            System.out.println(result);
        }

        scanner.close();
    }

    public static long splFibo(long n, long a, long b){
        // Base cases
        if (n == 0) return a;
        if (n == 1) return b;

        // Calculate the special Fibonacci number recursively

        for (long i = 2; i <= n; i++) {
            long fn = b ^ a; // Bitwise XOR
            a = b;
            b = fn;
        }

        return b;
    }
}
