//34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};

        int[] ans = {-1,-1};

        ans[0] = Search(a,8, true);
        ans[1] = Search(a,8,false);

        System.out.print(Arrays.toString(ans));

    }
    private static int Search(int[] nums, int target, boolean searchFistIdx){
        int idx = -1;
        if(nums.length == 0){
            return idx;
        }


        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid -1;
            }else{
                idx = mid;
                //search in first half
                if(searchFistIdx){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }


        }
        return idx;


    }

}
