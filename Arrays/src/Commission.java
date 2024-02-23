import java.util.Scanner;

//Calculate Commission Percentage
public class Commission {
    public static void main(String[] args) {
        System.out.println("Enter sell amount: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calCommission(n);
    }

    private static void calCommission(int n) {
        double c = 0;
        if(n<1000){
            c = n*0;
        }
        else if(n>1000 && n<=3000){
            c = n * 0.15;
        }else{
            c = n*0.25;
        }
        System.out.println(c);
    }

}
