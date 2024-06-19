import java.util.Scanner;

public class FibNnumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //  1/udrRoot(5) [ ((1+udrRoot(5))/2)^n - ((1-udrRoot(5))/2)^n ]
        int ans = (int)((Math.pow( ((1+Math.sqrt(5))/2), n) - Math.pow( ((1-Math.sqrt(5))/2), n)) / Math.sqrt(5));
        System.out.println(ans);
    }
}
