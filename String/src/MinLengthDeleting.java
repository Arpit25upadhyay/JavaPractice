public class MinLengthDeleting {
    public static void main(String[] args) {
        String s = "cabaabac";
        System.out.println(minimumLength(s));
    }
    public static int minimumLength(String s) {
        int l = s.length();

        if(l == 1){
            return 1;
        }

        int i = 0;
        int j = l-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return j - i + 1;
            }

            if(s.charAt(i) == s.charAt(j)){

                while(i < j && s.charAt(i) == s.charAt(i+1)) i++;
                while(i < j && s.charAt(j) == s.charAt(j-1)) j--;
                i++;
                j--;
            }
        }

        return j-i+1;
    }
}
