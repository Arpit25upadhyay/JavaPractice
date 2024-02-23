//Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].


import java.util.Arrays;

public class ElementPosition {
    public static void main(String[] args) {
        //initial ans
        int[] ans = {-1,-1};

        int[] arr = {5,6,7,7,7,7,8,8,9,10};
        int target = 7;

        ans[0] = Search(arr, target, true);
        ans[1] = Search(arr, target, false);

        System.out.println(Arrays.toString(ans));
    }

    static int Search(int[] arr, int target, boolean searchStartIdx){

        int idx = -1;
        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        while (start <= end){
            mid = start +(end-start)/2;

            //simple binary search
            if(arr[mid]< target){
                start =  mid+1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                //first ans
                idx = mid;

                //may be possible occurrence on left side i.e. first element
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
