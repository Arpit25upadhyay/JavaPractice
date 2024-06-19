package Easy;

public class EasyPrint {
    public static void main(String[] args) {
        int n = 5;
        printTill1(n);
    }

    public static void printTill1(int n){
        if(n == 1){
            System.out.print( 1);
            return;
        }
        System.out.print(n + " ");
        printTill1(n-1);
    }
}
