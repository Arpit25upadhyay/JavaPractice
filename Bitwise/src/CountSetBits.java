public class CountSetBits {
    public static void main(String[] args) {
        int n = 30 ;
        System.out.println(countSetBits(n));
        //System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int countSetBits(int n){
        int total = 0;
        for(int i = 1; i<=n; i++){
            total += setBit(i);
        }
        return total;
    }

    public static int setBit(int n){
        int c = 0;
        // while (n > 1) {
        //     c = n&1;
        //     n = (n >> 1);
        // }

        while(n!=0){
            n = (n & (n-1));
            c++;
        }
        return c;
    }
}
