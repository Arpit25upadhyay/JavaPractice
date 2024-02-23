//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal");
        int p = sc.nextInt();
        System.out.println("Enter the Time(year)");
        int t = sc.nextInt();
        System.out.println("Enter the Rate");
        float r = sc.nextFloat();

        float SI = (p*r*t)/100;

        System.out.println("Simple interest is "+ SI);
    }
}


//        To find out whether the given String is Palindrome or not.
//        To find Armstrong Number between two given number.