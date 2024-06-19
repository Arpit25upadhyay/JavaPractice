public class threeSumCloset {
    public static void main(String[] args) {
        int [] n = {-1,2,1,-4};
        System.out.println(threeSumClosest(n,1));
    }
    public static int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        int res = 0;

        if(n==3){
            for(int x : nums ){
                res +=x;
            }
            return res;
        }

        for(int i = 0; i<n-2; i++){
            int n1 = -(nums[i])+target;
            int start = i+1;
            int end = n-1;
            while(start<end){
                int temp = nums[start] + nums[end];

                if(temp - n1 == target){
                    return nums[start] + nums[end] + nums[i];
                }else if(temp > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;

    }
}
