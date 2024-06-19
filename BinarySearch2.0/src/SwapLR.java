import java.util.ArrayList;

public class SwapLR {
    public static void main(String[] args) {
        System.out.println(canTransform("RXXLRXRXL","XRLXXRRLX"));
    }
    public static boolean canTransform(String start, String end) {

        if(!(start.replace("X","").equals(end.replace("X","")))) return false;

        ArrayList<Integer> lStart = new ArrayList<>();
        ArrayList<Integer> rStart = new ArrayList<>();
        ArrayList<Integer> lEnd = new ArrayList<>();
        ArrayList<Integer> rEnd = new ArrayList<>();

        for (int i = 0; i < start.length(); i++) {
            if(start.charAt(i) == 'R'){
                rStart.add(i);
            }
            if(start.charAt(i) == 'L'){
                lStart.add(i);
            }
        }

        for (int i = 0; i < end.length(); i++) {
            if(end.charAt(i) == 'R'){
                rEnd.add(i);
            }
            if(end.charAt(i) == 'L'){
                lEnd.add(i);
            }
        }


        int x = 0;
        int y = 0;
        while(x<rStart.size()){
            if(rStart.get(x) > rEnd.get(x)) return false;
            x++;
        }
        while(y<lStart.size()){
            if(lStart.get(y) < lEnd.get(y)) return false;
            y++;
        }
        return true;
    }
}
