package Easy;

public class StringLength {
    public static void main(String[] args) {
        String s = "Arpit";
        System.out.println(lenCalculator(s));
    }

    public static int lenCalculator(String s){
        if(s == ""){
            return 0;
        }
        return 1+lenCalculator(s.substring(1));
    }
}
