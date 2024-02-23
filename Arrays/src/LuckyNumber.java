import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };

        System.out.println(luckyNum(matrix));
    }

    static List<Integer> luckyNum(int[][] matrix){
        List<Integer> a = new ArrayList<Integer>();

        for(int [] row : matrix){
            int min = row[0];
            for(int i=1; i< row.length; i++){
                min = Math.min(min, row[i]);
                a.add(min);
            }
        }

        int max = 0;
        for(int e : a){
            max = Math.max(max,e);
        }

        List<Integer> ans = new ArrayList<Integer>();

        ans.add(max);

        return ans;
    }
}
