public class LengthOfString {
    public static void main(String[] args) {
        String s = "Arpit Upadhyay";
        System.out.println(Size(s));
    }

    private static int Size(String s) {
        if(s == "") return 0;

        return 1+Size(s.substring(1));
    }
}
