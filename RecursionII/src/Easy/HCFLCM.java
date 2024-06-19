package Easy;

import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        System.out.println("Enter 2 Numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod = a*b;
        int hcf = findHcf(a,b);
        System.out.println("LcM: "+ prod/hcf);
        System.out.println("HCF: " + hcf);
    }

    public static int findHcf(int a, int b){
        if(b == 0){
            return a;
        }
        return findHcf(b, a%b);
    }
}
