import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{3,3})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();

        //Add all elements to set from array 1
        for(int n1 : nums1){
            intersection.add(n1);
        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        //add all element to arraylist
        for(int n2: nums2){
            if(intersection.remove(n2)){
                res.add(n2);
            }
        }

        //adding all the element to array from array list
         int[] arr = new int[res.size()];
         for (int i= 0; i < res.size(); i++) {
             arr[i] = res.get(i);
         }



        return arr;
    }
}
