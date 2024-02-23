//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElement {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start =0;
        int end = nums.length-1;

        //checking boundaries
        if(nums[start] != nums[start+1]){
            return nums[start];
        }
        if(nums[end] != nums[end-1]){
            return nums[end];
        }


        while(start <= end){
            int mid = start  + (end-start)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }

            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{ // if mid is odd and is equal to mid+1...then unique value is on left side
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;

    }
}
