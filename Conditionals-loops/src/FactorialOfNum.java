import java.util.Scanner;

//Factorial Program In Java
public class FactorialOfNum {
    public static void main(String[] args) {
        System.out.print("Enter of Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = 1;
        while(n!=1){
            fac *= n;
            n--;
        }
        System.out.println( fac);
    }

}
