package Easy;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(revese(1324, 0));
    }

    public static int revese(int n, int ans){
        if(n == 0){
            return ans;
        }
        int r = n%10;
        ans = ans * 10 + r;
        return revese(n/10, ans);
    }

}
