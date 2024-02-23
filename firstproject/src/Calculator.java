import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Final = 0;
        //infinite loop till x
        while (true){
            System.out.println("Enter the operator");
            char op = sc.next().trim().charAt(0);

            if(op == '+'||op== '-'|| op == '*'|| op == '/' || op == '%'){

                System.out.println("Enter the nos");
                int n = sc.nextInt();
                int m = sc.nextInt();

                if(op == '+'){
                    Final = n + m;
                }else if(op == '-'){
                    Final = n-m;
                }else if(op =='*'){
                    Final = n*m;
                }else if( op =='/' && m!=0){
                    Final = n/m;
                }else {
                    Final = n % m;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("Answer is: "+ Final);
        }
    }
}
