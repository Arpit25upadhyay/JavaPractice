public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        if(n == 0){
            System.out.println("No");
        }
        else if((n & (n-1)) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
