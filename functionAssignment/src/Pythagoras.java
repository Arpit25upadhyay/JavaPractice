//Write a function to check if a given triplet is a Pythagorean triplet or not.
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(isPythagoras(a,b,c));
    }

    private static String isPythagoras(int a, int b, int c) {
        return Math.pow(c,2) == Math.pow(a,2)+Math.pow(b,2) ? "Pythagorean triplet" : "Not Pythagorean triplet";
    }

}
