public class InsertionPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
    static int  searchInsert(int[] nums, int target) {

        int start = 0, mid =0;
        int end = nums.length-1;

        while(start<=end){
            mid = start+((end-start)/2);
            if(nums[mid]> target){
                end = mid-1;
            }else if(nums[mid]< target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;

    }
}
