public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 1;
        int peak = findPeak(nums);
        System.out.println(peak);
//        if(nums[peak] == target){
//            System.out.println(peak);
//        }
//        else if(peak == -1){
//            System.out.println( searchInRange(nums, target, 0, nums.length-1));
//        }
//        else if(target >= nums[0]){
//            System.out.println(searchInRange(nums, target, 0, peak));
//        }else {
//            System.out.println( searchInRange(nums, target, peak+1, nums.length-1));
//        }
    }


    public static int findPeak(int[] nums){
        int start  =0;
        int end = nums.length-1;


        while (start <= end) {
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>= nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

//    public static int searchInRange(int[]nums, int target, int start, int end){
//        while(start<=end){
//            int mid = start +(end-start)/2;
//
//            if(nums[mid]== target){
//                return mid;
//            }
//            if(nums[mid]>target){
//                end = mid-1;
//            }else{
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
}
