//        Input currency in rupees and output in USD.

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in ₹");
        long rupees = sc.nextLong();
        System.out.println("Converted Amount in $: " + (rupees * 0.012));

    }
}
