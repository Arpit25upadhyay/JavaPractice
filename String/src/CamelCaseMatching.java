import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        System.out.println(camelMatchII(queries,pattern));
    }
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList();
        for(String word: queries){
            res.add(check(word, pattern));
        }
        return res;
    }

    public static boolean check(String word, String pattern){
        int capCount = 0;
        int i  = 0;
        for(int j = 0; j< word.length(); j++){
            if(i<pattern.length() && word.charAt(j) == pattern.charAt(i)){
                i++;
            }else if('A' <= word.charAt(j) && word.charAt(j) <= 'Z'){
                capCount++;
            }
        }
        return (i == pattern.length() && capCount == 0);
    }

    public static List<Boolean> camelMatchII(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList();
        for(String word: queries){
            res.add(checkII(word, pattern));
        }
        return res;
    }

    public static boolean checkII(String word, String pattern){
        int i = 0;
        int j = 0;
        int capCount = 0;
        while(i < word.length() ){
            if(j < pattern.length() && word.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else if('A' <= word.charAt(i) && word.charAt(i) <= 'Z'){
                capCount++;
                i++;
            }else{
                i++;
            }

        }

        return j == pattern.length() && capCount == 0 ? true : false;
    }
}
