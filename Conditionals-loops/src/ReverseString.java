//Reverse A String In Java

public class ReverseString {
    public static void main(String[] args) {
        String s = "Arpit";
//        int i  =0;
//        int j = s.length()-1;

        for(int j = s.length()-1; j>=0; j--){
            System.out.print(s.charAt(j));
        }
    }
}
