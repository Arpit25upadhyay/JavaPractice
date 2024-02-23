//Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10 ;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
