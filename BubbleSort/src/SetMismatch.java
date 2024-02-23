//https://leetcode.com/problems/set-mismatch/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
    int[] arr = {3,2,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    public static int[] findErrorNums(int[] arr) {

        int i =0;
        while(i< arr.length){
            if(arr[arr[i]-1] != arr[i]){
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();

        for(int j =0; j < arr.length; j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
                ans.add(j+1);
            }
        }

        int[] res = new int[ans.size()];

        for(int k = 0; k< ans.size(); k++){
            res[k] = ans.get(k);
        }
        return res;

    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
