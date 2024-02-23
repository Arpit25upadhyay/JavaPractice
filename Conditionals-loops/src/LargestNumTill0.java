//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumTill0 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int m = Integer.MIN_VALUE;
        while(true){
            int n  =sc.nextInt();

            if(n!=0) {
                m = Integer.max(m,n);
            }else{
                System.out.println(m);
                break;
            }
        }
    }
}
