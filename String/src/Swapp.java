import java.util.ArrayList;
import java.util.List;

public class Swapp {
    public static void main(String[] args) {
        System.out.println(canTransform("LXXLXRLXXL","XLLXRXLXLX"));
    }
    public static boolean canTransform(String start, String end) {
        if(!(start.replace("X","").equals(end.replace("X",""))) )return false;

        //check length
        if(start.length() != end.length()) return false;

        //check no. of R and L;
        int rStart = 0;
        int lStart = 0;
        int rEnd = 0;
        int lEnd = 0;
        int i =0;
        while(i < start.length()){
            if(start.charAt(i) == 'R') rStart++;
            if(start.charAt(i) == 'L') lStart++;
            if(end.charAt(i) == 'R') rEnd++;
            if(end.charAt(i) == 'L') lEnd++;
            i++;
        }

        if(!(rStart == rEnd && lStart == lEnd)) return false;

        List<Integer> lStartList = new ArrayList<>();
        List<Integer> rStartList = new ArrayList<>();
        List<Integer> lEndList = new ArrayList<>();
        List<Integer> rEndList = new ArrayList<>();


        for(int idx = 0; i<start.length(); i++){
            if(start.charAt(i) == 'L') lStartList.add(idx);
            if(start.charAt(i) == 'R') rStartList.add(idx);
        }
        for(int idx = 0; i<end.length(); i++){
            if(end.charAt(i) == 'L') lEndList.add(idx);
            if(end.charAt(i) == 'R') rEndList.add(idx);
        }

        for(int j = 0; j<lStartList.size(); j++){
            if(lStartList.get(j) < lEndList.get(j)) return false;
        }

        for(int j = 0; j<rStartList.size(); j++){
            if(rStartList.get(j) > rEndList.get(j)) return false;
        }

        return true;

    }
}
