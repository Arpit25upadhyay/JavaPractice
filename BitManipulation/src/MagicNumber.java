public class MagicNumber {
    public static void main(String[] args) {
        int n = 30;
        int ans = 0;
        int i = 1;
        while(n>0){
            int l = n&1;
            ans += l* Math.pow(5, i);
            n = n >> 1;
            i++;
        }


        System.out.println(ans);
    }
}

