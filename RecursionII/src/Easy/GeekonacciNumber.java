package Easy;

import java.util.Scanner;

public class GeekonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter task");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(number(n,a,b,c));
        }
        sc.close();
    }

    public static int number(int n, int a, int b, int c){
        if(n == 1) return a;
        if(n == 2) return b;
        if(n == 3) return c;

        return number(n-1,a,b,c)+number(n-2,a,b,c)+number(n-3,a,b,c);
    }
}
