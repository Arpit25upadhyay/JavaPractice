import java.util.ArrayList;
import java.util.List;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelMatch(new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FB"));
    }

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();

        for(String q :  queries){
            res.add(checkCase(q, pattern));
        }

        return res;
    }

    public static boolean checkCase(String q, String p){

        int i = 0;
        int capCount = 0;
        for(int j = 0; j< q.length(); j++){
            if(i< p.length() && q.charAt(j) == p.charAt(i)) i++;
            else if('A'<= q.charAt(j) && q.charAt(j) <= 'Z') capCount++;
        }

        return i == p.length() && capCount == 0;
    }
}
