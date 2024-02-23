//Find ncr npr
/*
* NcR = n!/r!(n-r)!
*
*NpR = n!/(n-r)!
*
* */


import java.util.Scanner;

public class NcRNpR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select An option");
        System.out.println("1. nCr");
        System.out.println("2. nPr");
        int opt = sc.nextInt();
        int n, r;

        switch (opt){
            case 1:
                System.out.println("Enter n: ");
                n = sc.nextInt();
                System.out.println("Enter r: ");
                r =  sc.nextInt();
                int nCr =  factorial(n)/(factorial(r)*factorial(n-r));
                System.out.println(nCr);
                break;
            case 2:
                System.out.println("Enter n: ");
                n = sc.nextInt();
                System.out.println("Enter r: ");
                r =  sc.nextInt();
                int nPr = factorial(n)/factorial(n-r);
                System.out.println(nPr);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private static int factorial(int n) {
        int f = 1;
        while(n>1){
            f *= n;
            n--;
        }
        return f;
    }
}
