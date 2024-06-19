public class StringLength {
    public static void main(String[] args) {
        String s = "Arpit";
        System.out.println("Length of string: "+ length(s));
    }

    public static int length(String s){
        if(s == "") return 0;
        return 1+ length(s.substring(1));
    }
}
