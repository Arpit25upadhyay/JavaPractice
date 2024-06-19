public class KthBinary {
    public static void main(String[] args) {

    }
    public static char findKthBit(int n, int k) {
        String s = binaryString(n);
        return s.charAt(k-1);
    }

    public static String binaryString(int n){
        if(n == 0){
            return "0";
        }

        return binaryString(n-1) + "1" + reverseAndInvert(binaryString(n-1));
    }

    public static String reverseAndInvert(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--){
            sb.append(invert((int)(s.charAt(i))));
        }
        return sb.toString();
    }

    public static char invert(int i){
        return (char)(i^1);
    }
}
