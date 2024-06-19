import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> a = subSetSum(0,arr, 0);
        Collections.sort(a);
        System.out.println(a);
    }

    public static List subSetSum(int i, int[] arr, int sum){
        List<Integer> ans = new ArrayList<>();
        if(i == arr.length){
            ans.add(sum);
            return ans;
        }
        ans.addAll(subSetSum(i+1, arr, sum + arr[i]));
        ans.addAll(subSetSum(i+1, arr, sum));
        return ans;
    }
}
