public class HomogenousSubstring {
    public static void main(String[] args) {
        System.out.println(countHomogenous("abbcccaa"));
    }
    public static int countHomogenous(String s) {
        int count = 0;
        int len = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(i!= 0 && s.charAt(i) == s.charAt(i-1)){
                len++;
            }else{
                len = 1;
            }
            count += len;
        }
        return count;
    }
}
