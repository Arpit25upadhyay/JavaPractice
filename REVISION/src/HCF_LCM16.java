public class HCF_LCM16 {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        int p = a*b;
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("HCF is: "+a);
        System.out.println("LCM is: "+ p/a);
    }
}
