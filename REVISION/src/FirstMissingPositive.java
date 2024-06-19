public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]){
                swap(nums, i);
            }else{
                i++;
            }
        }

        for(int j = 0; j<n; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return -1;
    }


    public static void swap(int[] arr, int i){
        int temp = arr[arr[i]-1];
        arr[arr[i]-1] = arr[i];
        arr[i]= temp;
    }
}
