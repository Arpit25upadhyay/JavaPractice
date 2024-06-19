package Easy;

public class FirstUppercaseLetter {
    static String s = "geeksforgeeKs";
    public static void main(String[] args) {

        System.out.println(upperCase(s));
        System.out.println(upperCaseFn(0));
    }

    public static char upperCase(String s){

        for(char c : s.toCharArray()){
            if('A'<= c && c <='Z'){
                return c;
            }
        }
        return ' ';
    }

    public static char upperCaseFn(int i){
        if(i == s.length()){
            return ' ';
        }
        if('A'<=s.charAt(i) && s.charAt(i) <='Z') {
            return s.charAt(i);
        }
        return upperCaseFn(++i);
    }
}
