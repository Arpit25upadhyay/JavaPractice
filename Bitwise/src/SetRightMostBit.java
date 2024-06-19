public class SetRightMostBit {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(setRightMostBit(n));
    }

    private static int setRightMostBit(int n) {
        if(n == 0) return 1;

        int pos = rightUnSet(n);

        return n | (1<<pos);
    }

    private static int rightUnSet(int n) {
        int idx = 0;
        while(true){
            if((n&1) ==0) break;
            n = n>>1;
            idx++;
        }
        return idx;
    }
}
