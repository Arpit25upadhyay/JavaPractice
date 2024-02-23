//Reverse a number 1234 => 4321
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int o =0;
        while(n!=0){
            int r = n%10;
            n = n/10;
            o = o*10+r;
        }
        System.out.println(o);

    }
}
