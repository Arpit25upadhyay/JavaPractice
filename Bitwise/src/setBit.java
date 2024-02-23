import java.math.BigInteger;

public class setBit {
    public static void main(String[] args) {
        int n = 429496729;
        int count = 0;

        System.out.println(Integer.toBinaryString(n));

        while(n>0){
          n =  (n & (n-1));

          //n = n-(n&(-n));
          count++;
        }
        System.out.println(count);

    }
}
