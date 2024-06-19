public class FiboTwoTypes {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int i = 0;

        while(true){
            a = fibo1(i++);
            if(a>n) break;
            System.out.println(a);
        }


    }

    public static int fibo1(int n){
        double r1 = Math.pow(((1+Math.sqrt(5))/2), n);
        double r2 = Math.pow(((1-Math.sqrt(5))/2), n);;

        return (int) ((r1-r2)/Math.sqrt(5));
    }
}
