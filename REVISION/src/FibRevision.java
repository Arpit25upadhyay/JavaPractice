public class FibRevision {
    public static void main(String[] args) {
        //find nth fib number
        int n= 5;
        System.out.println(fibByFormula(n));

        System.out.println(fibByRecursion(5));
    }
    public static int fibByFormula(int n){

        double a = Math.pow( ((1+Math.sqrt(5))/2), n);
        double b = Math.pow(((1-Math.sqrt(5))/2),n);

        return (int)((a-b)/ Math.sqrt(5));
    }

    public static int fibByRecursion(int  n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibByRecursion(n-1)+ fibByRecursion(n-2);
    }
}
