import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbsoluteDiff {
    public static void main(String[] args) {

        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i< arr.length-1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
        }

        for(int j = 0; j< arr.length-1; j++){
            if(arr[j+1]-arr[j] == minDiff){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[j]);
                list.add(arr[j + 1]);
                res.add(list);
            }

        }

        return res;
    }
}
