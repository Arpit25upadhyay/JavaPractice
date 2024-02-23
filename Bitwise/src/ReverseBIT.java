public class ReverseBIT {
    public static void main(String[] args) {
        System.out.println(reverseBits(10011100));
    }
    public static int reverseBits(int n) {
        String s = Integer.toString(n);
        StringBuilder op  =  new StringBuilder();

        for(int i = s.length()-1; i>=0; i--){
           op.append(s.charAt(i));
        }
        return Integer.parseInt(op.toString());

    }
}
