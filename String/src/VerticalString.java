import java.util.ArrayList;
import java.util.List;

public class VerticalString {
    public static void main(String[] args) {

        String s = "TO BE OR NOT TO BE";

        for(String verWord : printVertically(s)){
            System.out.println(verWord);
        }
        
    }
    public static List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLength = biggestSting(words);

        for(int i = 0; i<maxLength; i++){
            StringBuilder verticalWord = new StringBuilder();
            for(String word : words){
                if(word.length() > i){
                    verticalWord.append(word.charAt(i));
                }else{
                    verticalWord.append(" ");
                }
            }
            ans.add(trimRight(verticalWord.toString()));
        }
        return ans;
    }

    public static String trimRight(String word){
        int i = word.length();
        while(--i>=0){
            if(word.charAt(i)!= ' '){
                return word.substring(0, i+1);
            }
        }
        return null;
    }

    public static int biggestSting(String[] words){
        int maxLen = words[0].length();
        for(String a : words){
            maxLen = Math.max(a.length(), maxLen);
        }
        return maxLen;
    }
}
