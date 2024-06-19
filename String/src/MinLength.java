public class MinLength {
    public static void main(String[] args) {
        String s = "cabaabac";
        System.out.println(delete(s));
    }

    public static int delete(String s){
        if(s.length() == 1) return 1;

        int i = 0;
        int j = s.length()-1;

        while (i<j && s.charAt(i) == s.charAt(j)){
            while (i<j && s.charAt(i) == s.charAt(i+1)) i++;
            while (i<j && s.charAt(j) == s.charAt(j-1)) j--;
            i++;
            j--;
        }
        return i>j ? 0 : j-i+1;
    }
}
