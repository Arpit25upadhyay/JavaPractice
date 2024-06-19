public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println((firstMissingPositive(arr)));
    }
    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i] > 0 && nums[i] <=n && nums[nums[i]-1] != nums[i]){
                swap(nums, i);
            }else{
                i++;
            }
        }

        for(int j =0; j<n; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }

    public static void swap(int[] nums, int i){
        int temp = nums[nums[i]-1];
        nums[nums[i]-1] = nums[i];
        nums[i] = temp;
    }
}
