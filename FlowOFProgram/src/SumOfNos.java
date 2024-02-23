//Take two numbers and print the sum of both.

import java.util.Scanner;

public class SumOfNos {
    public static void main(String[] args) {
        System.out.println("Enter first no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter Second no.");
        int m = sc.nextInt();
        int sum = n+m;
        System.out.println("sum is :"+ sum);

    }
}
