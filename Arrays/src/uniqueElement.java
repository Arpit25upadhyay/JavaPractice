public class uniqueElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int n = findUnique(nums);
        System.out.println(nums[n]);
    }

    private static int findUnique(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        if(end == 0){
            return nums[0];
        }
        if(nums[start] != nums[start+1]){
            return start;
        }
        if(nums[end] != nums[end-1]){
            return end;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return mid;
            }

            if(mid % 2 ==0){
                if(nums[mid] == nums[mid-1]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else {
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
