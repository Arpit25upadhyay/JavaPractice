import java.util.Scanner;

// check number is armstrong or not
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is armstrong or not?");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        int originalNumber = n;
        int l =  Integer.toString(n).length();
        int t=0;
        while (n>0){
            int r = n%10;
            t += Math.pow(r,l);
            n = n/10;
        }
        return originalNumber == t;
    }
}
