package Easy;

public class FactII {
    public static void main(String[] args) {
        System.out.println( factFun(5));
    }

    private static int factFun(int n) {
        if(n== 0){
            return 0;
        }
        if(n <= 2){
            return n;
        }

        return  n*factFun(n-1);
    }
}
