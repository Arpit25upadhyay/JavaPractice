import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int ans = 0;
        while (n>0){
            int r = n%10;
            n = n/10;
            ans = ans*10+r;
            //System.out.print(r);
        }
        System.out.println(ans);
    }
}
