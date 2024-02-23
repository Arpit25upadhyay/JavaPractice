import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Option");
        System.out.println("1. CGPA to Percentage");
        System.out.println("2. Percentage to CGPA");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter CGPA");
                float cgpa = sc.nextFloat();
                System.out.println((cgpa*9.5) + "%");
                break;
            case 2:
                System.out.println("Enter Percentage");
                float per = sc.nextFloat();
                System.out.println(per/9.5);
                break;
            default:
                System.out.println("Invalid Option");


        }
    }
}
