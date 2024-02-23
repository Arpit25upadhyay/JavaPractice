//Input a year and find whether it is a leap year or not.

import java.lang.System;
import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4 == 0){
            System.out.println("It is a leap Year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}