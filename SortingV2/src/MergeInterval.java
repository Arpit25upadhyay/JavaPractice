import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,4},{2,6},{8,9},{8,10},{9,11},{15,18},{16,17}};
        for(int[] a : merge(arr)){
            System.out.print(Arrays.toString(a));
        }
    }
    public static int[][] merge(int[][] intervals) {
        int n  = intervals.length;
        Arrays.sort(intervals, Comparator.comparing(a->a[0]));
        List<List<Integer>> ans = new ArrayList<>();

//        for(int i = 0; i<n; i++){
//            int start = intervals[i][0];
//            int end = intervals[i][1];
//            if (!ans.isEmpty()) {
//                List<Integer> lastEle = ans.get(ans.size() - 1);
//                if (end <= lastEle.get(1)) {
//                    continue;
//                }
//            }
//            for(int j = i+1; j<n; j++){
//                if(intervals[j][0] <= end ){
//                    end = Math.max(intervals[j][1],end);
//                }else{
//                    break;
//                }
//            }
//            List<Integer> newInt = new ArrayList<>();
//            newInt.add(start);
//            newInt.add(end);
//            ans.add(newInt);
//        }


        //ans.add(Arrays.asList(intervals[0][0]));

        for(int i = 0; i<n; i++){
            int start = intervals[i][0] ;
            int end = intervals[i][1] ;
            if(ans.isEmpty()){
                List<Integer> l = new ArrayList<>();
                l.add(start);
                l.add(end);
                ans.add(l);
            }else{
                int lastEnd = ans.getLast().get(1);

                if(lastEnd >= start){
                    int newEnd = Math.max(lastEnd, end);
                    ans.getLast().set(1,newEnd);
                }else{
                    List<Integer> l = new ArrayList<>();
                    l.add(start);
                    l.add(end);
                    ans.add(l);
                }
            }

        }

        int rows = ans.size();
        int[][] result = new int[rows][2];

        for (int i = 0; i < rows; i++) {
            List<Integer> currentList = ans.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                result[i][j] = currentList.get(j);
            }
        }

        return result;
    }
}
