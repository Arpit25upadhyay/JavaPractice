import java.util.Scanner;

//Reverse A String In Java
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        //String[] sArr = new String[s.length()];
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
      }
    }
}
