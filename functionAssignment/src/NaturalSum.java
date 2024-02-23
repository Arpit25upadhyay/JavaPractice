import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
