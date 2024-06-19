//https://leetcode.com/problems/first-missing-positive/
public class missingNum {
    public static void main(String[] args) {
        int[] a = {1,2,0};
        System.out.println(firstMissingPositive(a));
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while(i<n){
            if(nums[i] <= 0|| nums[i]>n || nums[nums[i]-1] == nums[i]){
                i++;
            }else{
                swap(nums, i);
            }
        }

        for(int k = 1; k<=n; k++){
            if(Math.abs(nums[k-1]) !=k){
                return k;
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
