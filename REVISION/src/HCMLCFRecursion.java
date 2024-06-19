public class HCMLCFRecursion {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        System.out.println(HCF(a,b));
    }

    public static int HCF(int a, int b){
        if(b == 0){
            return a;
        }
        return HCF(b, a%b);
    }
}
