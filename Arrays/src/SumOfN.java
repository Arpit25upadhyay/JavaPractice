import java.util.Scanner;

//Sum of N numbers
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many no. you want to enter");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int[] arr = new int[n];
        int T = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            T += arr[i];
        }
        System.out.println(T);
    }
}
