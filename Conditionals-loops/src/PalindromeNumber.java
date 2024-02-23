public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        System.out.println("num is palindrome: " + StringMethod(n));
        System.out.println("num is palindrome: " + NumberMethod(n));
    }

    public static boolean StringMethod(int n){
        String s =  String.valueOf(n);
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static boolean NumberMethod(int n){
        int ogNumber = n;
        int reverseNum = 0;
        while(n!= 0){
            int r = n%10;
            n = n/10;
            reverseNum =  reverseNum*10+r;
        }
        if(ogNumber == reverseNum){
            return true;
        }else{
            return false;
        }

    }
}
