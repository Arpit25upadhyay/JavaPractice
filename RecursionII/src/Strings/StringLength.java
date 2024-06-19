package Strings;

public class StringLength {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        System.out.println(len(str));
    }

    public static int len(String s){
        if(s == ""){
            return 0;
        }
        return len(s.substring(1)) + 1;
    }
}
