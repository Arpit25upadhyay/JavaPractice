public class HCF_LCMII {
    public static void main(String[] args) {
        int a =24;
        int b =12;
        int prod = a*b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("HCF : " + a);
        System.out.println("LCM : " + prod/a);
    }
}
