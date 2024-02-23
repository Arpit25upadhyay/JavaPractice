//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter Any number: ");
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            if(n%2 == 0){
                System.out.println("even hai re baba");
            }else{
                System.out.println("Odd hai re baba");
            }
        }catch (Exception e){
            System.out.println("Jayda Bakchodi naa kr");
            System.out.println("ChupChap valid number daal");
        }

    }
}
