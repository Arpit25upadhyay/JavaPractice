/*
Batting Average

{Batting Average} = {Runs Scored}}/{{Number of dismissals}}
where
{Number of dismissals = Number of innings - Number of innings he remained Not Out}
*/

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total run scored");
        int runs  =  sc.nextInt();
        System.out.println("Enter total innings");
        int i = sc.nextInt();
        System.out.println("Enter total innings(Not Out)");
        int ni = sc.nextInt();
        int battingAvg = runs/(i-ni);
        System.out.println(battingAvg);
    }
}
