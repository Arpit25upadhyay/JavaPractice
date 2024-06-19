package Strings;

public class LengthOfString {

    public static void main(String[] args) {
        String  s = "Arpit";
        System.out.println(countLen(s));
        //System.out.println(s.substring(6));
    }

    public static int countLen(String s){
        if(s.equals(""))return 0;
        return countLen(s.substring(1)) + 1;
    }
}
