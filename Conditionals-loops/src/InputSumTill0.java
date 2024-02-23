//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class InputSumTill0 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n != 0){
                sum += n;
            }else{
                System.out.println(sum);
                break;
            }
        }
    }
}
