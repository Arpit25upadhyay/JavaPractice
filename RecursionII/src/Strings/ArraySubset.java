package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {
//        for(List<Integer> i : subSet(new int[]{1,2,3})){
//            System.out.println(i);
//        }

        for(List<Integer> i : subSetDuplicatesII(new int[]{1,2,3,3})){
            System.out.println(i);
        }
    }

    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        for(int n : arr){
            int len  = res.size();
            for(int i = 0 ; i<len; i++){
                List<Integer> internal = new ArrayList<>(res.get(i));
                internal.add(n);
                res.add(internal);
            }

        }

        return res;
    }

    public static List<List<Integer>> subSetDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int j = 0; j< arr.length; j++){
            start = 0;
            if(j>0 && arr[j] == arr[j-1]) {
                start = end + 1;
            }
            end = res.size()-1;
            int len  = res.size();
            for(int i = start ; i<len; i++){
                List<Integer> internal = new ArrayList<>(res.get(i));
                internal.add(arr[j]);
                res.add(internal);
            }

        }

        return res;
    }


    public static List<List<Integer>> subSetDuplicatesII(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        for(int j = 0; j< arr.length; j++){
            int len  = res.size();
            if(j>0 && arr[j] == arr[j-1]) {
                for(int i = len/2 ; i<len; i++){
                    List<Integer> internal = new ArrayList<>(res.get(i));
                    internal.add(arr[j]);
                    res.add(internal);
                }
            }
            else {
                for (int i = 0; i < len; i++) {
                    List<Integer> internal = new ArrayList<>(res.get(i));
                    internal.add(arr[j]);
                    res.add(internal);
                }
            }
        }
        return res;
    }
}
