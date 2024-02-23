//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;
public class FactorOfNum {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
