public class FirstNLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(arr, target).toString());
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};

        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);

        return res;
    }

    public static int binarySearch(int[] nums, int target, boolean leftIdx){
        int start = 0;
        int end =  nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                ans = mid;
                if(leftIdx){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
