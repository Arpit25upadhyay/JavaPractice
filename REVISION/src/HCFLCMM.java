public class HCFLCMM {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        int prod = a*b;
        int hcf = findHCF(a,b);
        System.out.println(hcf);
        System.out.println("LCM : "+ (prod/hcf));
    }

    private static int findHCF(int a, int b) {
        if(b==0) return a;
        return findHCF(b, a%b);
    }
}
