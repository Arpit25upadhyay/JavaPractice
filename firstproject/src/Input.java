import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        Type casting
//        int num = (int)(10.11f);
//        System.out.println(num);

//        Automatic type promotion
//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f * b) + (i/c) - (d-s);
//        System.out.println((f * b) + " " + (i/c) + " " + (d-s));
//        System.out.println(result);

        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int T = 0;
//        while(true){
//            String n = sc.nextLine();
//            if(n.equals("x")){
//                break;
//            }
//            int num = Integer.parseInt(n);
//            T+=num;
//        }
//        System.out.println("Sum of numbers: "+ T);

        String n;
        do{
          n = sc.nextLine();
          if(!n.equals("x")){
              int num = Integer.parseInt(n);
              T+=num;
          }
        }while (!n.equals("x"));
        System.out.println("Sum of numbers: "+ T);

            }
}
