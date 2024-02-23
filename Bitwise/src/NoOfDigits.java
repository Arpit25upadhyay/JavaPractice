public class NoOfDigits {
    public static void main(String[] args) {
        int base = 10; // Representation binary, decimal etc;
        int n = 1021211;

        int noOfDigit = (int)(Math.log(n)/Math.log(base)) + 1;

        System.out.println(noOfDigit);
    }
}
