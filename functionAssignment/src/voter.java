import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int n = sc.nextInt();

        System.out.println(isLegalVoter(n));
    }

    private static String isLegalVoter(int n) {
        return n>=18 ? "Valid voter" : "Invalid Voter";
    }
}
