import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number");
        long n = sc.nextLong();

        System.out.println("Which digit you want to count");
        int d = sc.nextInt();
        int count = 0;
        while (n > 0){
            long r = n % 10;
            if(r == d){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
