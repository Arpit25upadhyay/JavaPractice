import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        switch (n){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
