import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class RelativeSort {
    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // orderedMap --- int always in sorted order
        TreeMap<Integer, Integer> arr1Map = new TreeMap<>();

        int count = 1;
        for(int n : arr1){
            if (arr1Map.containsKey(n)){
                arr1Map.put(n, arr1Map.get(n) + 1);
            }else{
                arr1Map.put(n, count);
            }
        }

        ArrayList<Integer> aList = new ArrayList<>();

        for(int n2 : arr2){
            if(arr1Map.containsKey(n2)) {
                int i = 0;
                while (i < arr1Map.get(n2)) {
                    aList.add(n2);
                    i++;
                }
                arr1Map.remove(n2);
            }
        }
        for (int a: arr1Map.keySet()) {
            int i = 0;
            while (i< arr1Map.get(a)){
                aList.add(a);
                i++;
            }
        }

        int[] res = new int[aList.size()];

        for(int i =0 ; i <aList.size(); i++){
            res[i] = aList.get(i);
        }
        return res;

    }
}
