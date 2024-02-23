import java.util.Scanner;

//Calculate Depreciation of Value
// dv = v(1-r/100)^t
public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intial Cost");
        int IC = sc.nextInt();
        System.out.println("Enter rate of depreciation");
        double R = sc.nextInt();
        System.out.println("Enter timespan");
        int T = sc.nextInt();

        System.out.println(depValue(IC,R,T));
    }

    private static double depValue(int IC, double R, int T){
        return (IC*Math.pow((1-(R)/100),T));
    }
}
