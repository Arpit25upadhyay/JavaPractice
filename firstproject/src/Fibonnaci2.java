import java.util.Scanner;

//find nth fibonnaci no
//eg 5 = 0 1 1 2 3 op= 3
public class Fibonnaci2 {
    public static void main(String[] args) {
        System.out.println("Which fibonacci number you want");
        Scanner sc =new Scanner(System.in);
        int n  = sc.nextInt();
        int p = 0;
        int c = 1;
        if(n == 0){
            System.out.println(0);;
        }else if(n == 1){
            System.out.println(1);
        }else{
            for(int i = 2; i<= n; i++ ){
                int nxt =  p+c;
                p = c;
                c = nxt;
            }
            System.out.println(c);
        }
    }
}
