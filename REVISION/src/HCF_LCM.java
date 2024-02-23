import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args){
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int p = n*m;
        //HCF of Number
        while(m!=0){
            int temp = m;
            m = n%m;
            n = temp;
        }
        System.out.println("HCF : "+n);
        System.out.println("LCM : "+ (p/n));

    }
}
