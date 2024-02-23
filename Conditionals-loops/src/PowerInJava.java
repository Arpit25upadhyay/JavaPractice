import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter the Power: ");
        int p = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=p; i++){
            ans *= n;
        }
        System.out.println(ans);
    }
}
