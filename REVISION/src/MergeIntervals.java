import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4},
                {0,2},
                {3,5}
        };
        for(int[] a : merge(arr)){
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));


        int[][] ans = new int[n][2];
        int idx = 0;
        ans[idx++] = intervals[0];
        for (int i = 1; i < n; i++) {
            int start = intervals[i][0];
            int end =  intervals[i][1];

            if(start <= ans[idx-1][1]){
                ans[i-1][1] = Math.max(ans[idx-1][1],end);
            }else{
                ans[idx++] = new int[]{start,end};
            }
        }

        // Trim the ans array to remove unused slots
        return Arrays.copyOf(ans, idx);


    }
}
