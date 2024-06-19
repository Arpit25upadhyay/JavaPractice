import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SwapAdjacent {
    public static void main(String[] args) {
        String start = "RL";
        String end = "LR";

        System.out.println( canTransform(start,end));
    }

    private static boolean canTransform(String start, String end) {

        //Length of both string should be same
        if(start.length() != end.length()) return false;

        List<Integer> lStartList = new ArrayList<>();
        List<Integer> rStartList = new ArrayList<>();

        List<Integer> lEndList =  new ArrayList<>();
        List<Integer> rEndList = new ArrayList<>();

        for(int i = 0; i<start.length(); i++){
            if(start.charAt(i) == 'L'){
                lStartList.add(i);
            } else if (start.charAt(i) == 'R') {
                rStartList.add(i);
            }
        }

        for(int i = 0; i<end.length(); i++){
            if(end.charAt(i) == 'L'){
                lEndList.add(i);
            } else if (end.charAt(i) == 'R') {
                rEndList.add(i);
            }
        }

        //count of l and r should be same

        if(lStartList.size() != lEndList.size() || rStartList.size() != rEndList.size()) return false;


        int j = 0; //single pointer is enough size are same if it was diff thn op should be false

        while(j< lStartList.size()){
            if(lStartList.get(j) < lEndList.get(j)) return false;
            j++;
        }

        j= 0;
        while(j< rStartList.size()){
            if(rStartList.get(j) > rEndList.get(j)) return false;
            j++;
        }

        return  true;
    }
}
