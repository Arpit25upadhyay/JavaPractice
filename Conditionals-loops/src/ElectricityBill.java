//Calculate Electricity Bill
//for first 100 units 1.5/unit
//for next 100+ units 2.25/unit
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.print("Enter total unit consumption : ");
        Scanner sc  = new Scanner(System.in);
        int n =  sc.nextInt();
        double a = 0.0;
        if(n < 100){
            a =  n * 1.5;
        }else{
            a = 100*1.5 + ((n-100)*2.25);
        }
        System.out.println(a);
    }
}
