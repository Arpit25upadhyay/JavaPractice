public class HammingDist {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int count = 0;


        //return Integer.bitCount(x ^ y);
        while(x>0 || y>0){
            int a = x&1;
            int b = y&1;
            if((x&1)!=(y&1)){
                count++;
            }
            x = x>>1;
            y = y>>1;
        }
        return count;
    }
}
