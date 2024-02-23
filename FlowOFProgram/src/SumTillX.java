// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumTillX {
    public static void main(String[] args) {

        System.out.println("sum is: " + totalSum());
    }

    public static int totalSum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int sum =0;
        while(true){
            String n = sc.next();
            if(n.equals("x")){
                return sum;
            }else{
                sum += Integer.parseInt(n);
            }
        }
    }
}
