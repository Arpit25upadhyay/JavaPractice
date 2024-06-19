import java.util.Arrays;

public class ThreeSumCloset26 {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};

        System.out.println(threeSumClosest(arr, 1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if(n==3){
            int sum = 0;
            for(int x : nums){
                sum += x;
            }
            return sum;
        }


        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i<n-2; i++){
            int n1 = nums[i];
            ans = sumCloset(nums,n1, i+1, n-1, target);
        }
        return ans;
    }

    public static int sumCloset(int[] arr, int n1, int start, int end, int target){
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        while(start<end){
            long total = arr[start];
            total += n1;
            total += arr[end];

            if(diff > Math.abs((int)total - target)){
                diff = Math.abs((int)total - target);
                sum = (int)total;
            }
            if(total > target){
                end--;
            }else{
                start++;
            }
        }
        return sum;
    }
}
