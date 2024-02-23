//        Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        Float n = sc.nextFloat();
        Float m = sc.nextFloat();
        if(n>m){
            System.out.println(n + " is largest");
        } else if (m>n) {
            System.out.println(m + " is largest");
        }else{
            System.out.println("Equal");
        }
    }
}
