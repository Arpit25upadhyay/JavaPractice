public class pivotInDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target= 2;
        if(nums.length > 1){
            int pivotIdx = findPivot(nums);
            if(!binarySearch(nums, target, 0,pivotIdx)){
                System.out.println( binarySearch(nums, target, pivotIdx+1, nums.length-1));
            }
            System.out.println(true);;

        }else{
            System.out.println( nums[0]== target);
        }
    }

    public static boolean binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid]> target){
                end = mid-1;
            }else{
                start = mid+1;
            }


        }
        return false;
    }


    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                start++;
                end--;
            }
            //if pivot is in left hand side, then if nums[start] < num[mid] ==> nums[end] is always less then num[mid]
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return -1;
    }
}