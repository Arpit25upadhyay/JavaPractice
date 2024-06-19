public class Divide2Nums {
    public static void main(String[] args) {
        int a = -2147483648;
        int b = -1;

        System.out.println(divide(a,b));
    }
    public static int divide(int dividend, int divisor) {
        boolean sign = true;
        if(dividend == divisor) return 1;

        if((dividend>=0 && divisor <0) || (dividend <=0 && divisor >0)) sign = false;

        long newDividend = Math.abs(dividend);
        long newDivisor = Math.abs(divisor);
        long ans = 0;
        while(newDividend >= newDivisor){
            int count = 0;
            while(newDividend >= (newDivisor << (count+1))) count++;
            ans += (1<<count);
            newDividend -= (newDivisor <<(count));
        }

        if(ans == (1<<31) && sign) return Integer.MAX_VALUE;
        else if(ans == (1<<31) && !sign) return Integer.MIN_VALUE;
        else return sign ? (int)ans : (int)-ans;
    }
}
