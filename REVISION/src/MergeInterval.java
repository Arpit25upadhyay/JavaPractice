import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals ={
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int n = intervals.length;

        for(int[] a : mergeInt(intervals, n)){
            System.out.println(Arrays.toString(a));
        }

    }

    private static int[][] mergeInt(int[][] intervals, int n) {
        Arrays.sort(intervals, Comparator.comparingInt(a ->a[0]));
        int[][] ans = new int[n][];
        int idx = 0;
        for(int i = 0; i<n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(idx == 0){
                ans[idx++] = new int[]{start,end};
            } else if (start <= ans[idx-1][1]) {
                ans[idx-1][1] = Math.max(end, ans[idx-1][1]);
            } else{
                ans[idx++] = new int[]{start,end};
            }

        }
        return Arrays.copyOf(ans, idx);
    }
}
