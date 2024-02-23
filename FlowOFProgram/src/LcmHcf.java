//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        System.out.println("Enter 1st num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter 2nd num");
        int m = sc.nextInt();
        int prod = n*m;
        //HCF
        while(n!=0){
            int temp = n;
            n = m%n;
            m = temp;
        }
        System.out.println("HCF is: "+m);
        //prod of two num =  HCF * LCM
        System.out.println("LCM is: " + (prod/m));
    }
}
