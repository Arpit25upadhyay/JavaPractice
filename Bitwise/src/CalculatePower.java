public class CalculatePower {
    //calculate a^b
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int ans = 1;
        while(b>0){
            int last = b&1;
            b = b>>1;
            if(last !=0){
                ans = ans*a;
            }
            a*=a;
        }
        System.out.println(ans);
    }
}
