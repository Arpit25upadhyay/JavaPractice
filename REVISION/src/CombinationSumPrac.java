import java.util.ArrayList;
import java.util.List;

public class CombinationSumPrac {
    public static void main(String[] args) {
        int[] arr= {2,3,6,7};
        int target = 7;
        //findComb(0, arr, target, new ArrayList<>());
        for (List<Integer> l : findComb(0, arr, target, new ArrayList<>()) ){
            System.out.println(l);
        }
    }

    public static List<List<Integer>> findComb(int i, int[] arr, int t, List<Integer> combi){
        List<List<Integer>> ans = new ArrayList<>();
        if(i == arr.length){
            if(t == 0){
                ans.add(new ArrayList<>(combi));
                //System.out.println(combi);
            }
            return ans;
        }

        if(t == 0){
            ans.add(new ArrayList<>(combi));
            return ans;
        }
        if(t >= arr[i]){
            combi.add(arr[i]);
            ans.addAll( findComb(i, arr, t-arr[i], combi));
            combi.remove(combi.size()-1);
        }
        ans.addAll(findComb(i+1, arr, t, combi));

        return ans;
    }
}
