import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeDiff {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("12:12","12:13");
        System.out.println(findMinDifference(s));
    }
    public static int findMinDifference(List<String> timePoints) {
        int l = timePoints.size();
        int[] minArray = new int[l];

        int idx = 0;
        for(String t : timePoints){
            int h = Integer.parseInt(t.substring(0,2));
            int m = Integer.parseInt(t.substring(3));
            minArray[idx++] =  (h*60)+m;
        }

        Arrays.sort(minArray);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<minArray.length-1; i++){
            int timeDiff = minArray[i+1]-minArray[i];
            ans = Math.min(ans, timeDiff);
        }

        ans = Math.min(ans, minArray[l-1] - minArray[0]);

        return ans;
    }
}
