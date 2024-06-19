package Easy;

public class PrintToN {
    public static void main(String[] args) {
        printNumber(10);
    }

    public static void printNumber(int N){
        if(N < 1){
            return;
        }
        printNumber(N-1);
        System.out.println(N);
    }
}
