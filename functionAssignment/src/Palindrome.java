import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }

    private static String isPalindrome(int n) {
        int originalNum = n;
        int temp = 0;
        while (n>0){
            int r = n%10;
            temp = temp*10+r;
            n = n/10;
        }
        return originalNum == temp ? "Palindrome" : "Not Palindrome";
    }
}
