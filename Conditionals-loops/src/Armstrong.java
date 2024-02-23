import java.util.Scanner;

//Armstrong Number In Java
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int digitCount = s.length();
        int sum = 0;
        int temp = n;
        while(n!=0){
            int r = n%10;
            n=n/10;
            sum += Math.pow(r,digitCount);
        }
        if(sum == temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
