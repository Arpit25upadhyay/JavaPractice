package Easy;

public class CountZeros {
    public static void main(String[] args) {
        int n = 30210;
        System.out.println(count(n, 0));
    }

    public static  int count(int n, int count){
        if (n == 0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return count(n/10, count);
    }
}
