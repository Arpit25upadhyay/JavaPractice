import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        String s = "   fly me   to   the moon  ";
        int count = 0;

        s = s.trim();
        for(int i = s.length()-1; i>=0; i++){
            if(s.charAt(i) != ' '){
                count++;
            }
        }
        String[] arr = s.split(" ");


        res.append(strs[0]);
        int i = 0;

        return res.toString();
    }
}


