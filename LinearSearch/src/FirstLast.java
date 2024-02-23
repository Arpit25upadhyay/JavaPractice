//34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        System.out.print(Arrays.toString(searchRange(a,8)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = Search(nums, target, true);
        ans[1] = Search(nums, target, false);

        return ans;
    }

    private static int Search(int[] arr, int target, boolean searchStartIdx){
        int idx = -1;
        int start = 0;
        int end = arr.length - 1;

        //simple binary search
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                idx = mid;
                //possible occurrence on left side i.e. first element
                if(searchStartIdx){
                    end = mid-1;
                }else{
                    // possible occurrence on right side i.e last element
                    start = mid+1;
                }
            }
        }

        return idx;
    }

}
