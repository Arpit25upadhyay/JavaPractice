public class HCF_LCM {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int prod = a*b;
        while(b!=0){
            int temp = b;
            b = b%a;
            a= temp;
        }
        System.out.println(prod/a);
        System.out.println(a);
    }
}
