public class Complement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        int tmp = (int) (Math.pow(2,digits(num))-1);
        return tmp - num;
    }

    static int digits(int n){
        int count = 0;
        while(n > 0){
            n = n/2;
            count++;
        }
        return count;
    }
}
