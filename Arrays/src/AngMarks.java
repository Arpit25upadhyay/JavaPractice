import java.util.Scanner;

public class AngMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subject");
        int[] arr = new int[5];
        int Sum = 0;
        for (int i = 0 ; i<5;i++){
            arr[i] = sc.nextInt();
            Sum += arr[i];
        }
        System.out.println("Avg marks are: "+ Sum/5);
    }
}
