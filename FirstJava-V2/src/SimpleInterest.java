//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter Principal: ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();

        float SI = ((p*r*t)/100);
        System.out.println("Simple Interest is: "+ SI);
    }
}
