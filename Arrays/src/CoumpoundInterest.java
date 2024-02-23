//Compound Interest Java Program
//CI = a(1+r/100)^t

import java.util.Scanner;

public class CoumpoundInterest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter amount");
        double a = sc.nextInt();
        System.out.println("Enter interest");
        double r = sc.nextInt();
        System.out.println("Enter time");
        double t = sc.nextInt();
        //double x = Math.pow((1+((r)/100)),t);
        System.out.println(a * (Math.pow((1 + r / 100), t)) - a);

    }
}
