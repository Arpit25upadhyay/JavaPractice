import java.util.Scanner;

//Find if a number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n =  sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        int originalNum =  n;
        int revNum = 0;
        while (n>0){
            int r = n%10;
            revNum = revNum*10+r;
            n = n/10;
        }
        return revNum == originalNum;
    }
}
