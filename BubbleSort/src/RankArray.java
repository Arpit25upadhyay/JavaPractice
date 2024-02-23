import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class RankArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100,100,100})));
    }
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copiedArr);


        int count = 1;
        for(int n : copiedArr){
            if(!rankMap.containsKey(n))
                rankMap.put(n, count++);
        }

        for(int i = 0; i<arr.length; i++){
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}
