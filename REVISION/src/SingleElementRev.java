public class SingleElementRev {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        if(nums.length ==1) System.out.println(nums[0]);;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid > 0 && mid < nums.length && nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
                System.out.println(nums[mid]);
                return;
            }

            if(mid%2 == 0){
                if(mid > 0 && nums[mid] == nums[mid-1]) end = mid-1;
                else start = mid+1;
            }else{
                if(mid < nums.length && nums[mid] == nums[mid+1]) end = mid-1;
                else start = mid+1;
            }
        }
        System.out.println(-1);
        return;
    }
}
