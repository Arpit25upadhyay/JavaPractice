package Strings;

public class StringWOa {
    //static String b = "";
    public static void main(String[] args) {
        String s = "baccad";
        String b = "";
        stringWOA(s,b);
        //System.out.println(b);

        System.out.println(stringWOA(s));

        System.out.println(skipApple("arpitapplekhale"));

        System.out.println(skipAppNotApple("arpitapplekhaleapp"));
    }

    public static void stringWOA(String s,String b){
        if (s == "") {
            System.out.println(b);
            return;
        }
        if(s.charAt(0) != 'a') {
          b =  b + s.charAt(0);
        }
        stringWOA(s.substring(1),b);
    }

    public static String stringWOA(String s){
        if (s == "") return "";
        if(s.charAt(0) != 'a') return s.charAt(0) +  stringWOA(s.substring(1));
        return stringWOA(s.substring(1));
    }

    public static String skipApple(String s){
        if(s == "") return "";

        if(s.startsWith("apple")) return skipApple(s.substring(5));

        return s.charAt(0) + skipApple(s.substring(1));
    }

    public static String skipAppNotApple(String s){
        if(s == "") return "";

        if(s.startsWith("app") && !s.startsWith("apple")) return skipAppNotApple(s.substring(3));

        return s.charAt(0) + skipAppNotApple(s.substring(1));
    }
}
