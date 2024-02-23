//take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class HelloMe {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello! Welcome to this parallel Universe " + name.toUpperCase());
    }
}
