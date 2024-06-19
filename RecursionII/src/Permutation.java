import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        //List<List<Integer>> ans = findPermutation(new ArrayList<>(), nums, new boolean[nums.length]);

//        for(List l : ans) {
//            System.out.println(l);
//        }

        List<List<Integer>> ans = findPermuta(new ArrayList<>(), nums);

        for(List l : ans) {
            System.out.println(l);
        }

        System.out.println("----With Swapping----");
        for(int[] a : findPermuSwap(0, nums)){
            System.out.println(Arrays.toString(a));
        }
    }


    public static List<List<Integer>> findPermutation(List<Integer> ans, int[] nums, boolean[] freq){
        List<List<Integer>> res = new ArrayList<>();
        if(ans.size() == nums.length){
            res.add(new ArrayList<>(ans));
            return res;
        }

        for(int  i = 0; i<nums.length; i++){
            if(!freq[i]) {
                freq[i] = true;
                ans.add(nums[i]);
                res.addAll(findPermutation(ans, nums, freq));
                ans.remove(ans.size() - 1);
                freq[i] = false;
            }
        }
        return res;
    }

    public static List<List<Integer>> findPermuta(List<Integer> ans, int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            result.add(new ArrayList<>(ans));
            return result;
        }

        for(int i = 0; i<=ans.size(); i++){
            ans.add(i, nums[0]);
            result.addAll( findPermuta(ans, Arrays.copyOfRange(nums, 1, nums.length)));
            ans.remove(i);
        }

        return result;
    }

    public static List<int[]> findPermuSwap(int idx, int[] arr){
        List<int[]> res = new ArrayList<>();
        if(idx== arr.length){
            res.add(arr.clone());
        }

        for(int i = idx; i<arr.length; i++){
            swap(arr,idx,i);
            res.addAll(findPermuSwap(idx+1, arr));
            swap(arr,idx,i);
        }
        return res;
    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
