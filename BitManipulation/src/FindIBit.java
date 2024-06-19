public class FindIBit {
    public static void main(String[] args) {
        int n  = 10110111;
        int i = 5;
        int mask = 1 << (i-1);
        System.out.println( n & mask );
    }
}
