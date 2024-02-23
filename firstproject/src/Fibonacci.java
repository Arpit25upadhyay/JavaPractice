//To calculate Fibonacci Series up to n numbers.
//Program to print first ‘nth’ Fibonacci Numbers
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int c = 1;
        System.out.print(p + " ");
//        if(n==0){
//            System.out.println(p);
//        }
//        if(n == 1){
//            System.out.println(c);
//        }else
        {
            for (int i = 1; i < n; i++) {
                System.out.print(c + " ");
                int next = p + c;
                p = c;
                c = next;
            }
            }
        }

    }