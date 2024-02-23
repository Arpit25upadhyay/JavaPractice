public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findMagicNumber(n));
    }

    private static int findMagicNumber(int n) {
        int base = 5;
        int ans = 0;
        int i =1;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * Math.pow(base,i);
            i++;
            //base = base*5;
        }

        return ans;
    }
}
