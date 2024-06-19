public class HcfReveisin {
    public static void main(String[] args) {
        int n = 12;
        int m = 24;

        System.out.println(recursiveHCF(n,m));

        while(m!=0){
            int temp=m;
            m=n%m;
            n = temp;
        }
        System.out.println(n);


    }

    public static int recursiveHCF(int n, int m){
        if(m==0) return n;

        return recursiveHCF(m, n%m);
    }
}
