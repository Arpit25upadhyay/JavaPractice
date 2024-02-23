//https://leetcode.com/problems/split-array-largest-sum/
public class SubArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;// max element--- lowerlimit
        int end = 0;// max sum --upperLimit
        int mid = 0;
        for(int i =0;i<nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        //now apply binary search
        while (start< end){
            mid = start+(end-start)/2;

            //calculate how many pieces we can divide this with this mid(MAX SUM)
            int sum = 0;
            int pieces = 1;
            for(int n : nums){
                if((sum+n)>mid){
                    //we cannot add this is a subarray make new one
                    //[7,2,5,8,10] = [7,2,5] now we cannot add so
                    sum = n;
                    pieces++;
                }else{
                    sum+=n;
                }
            }
            if(pieces > k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end; //start== end
    }
}
