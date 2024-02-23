//https://leetcode.com/problems/sort-array-by-parity/
public class SortParity {
    public static void main(String[] args) {
        System.out.println(sortArrayByParity(new int[]{3,1,2,4}));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0, k= 0;
        int j = n-1;

        if(n  == 1){
            return nums;
        }

        while(k < n){
            if(nums[i]%2 == 0){
                res[i] = nums[i];
                i++;
            }else{
                res[j] = nums[i];
                j--;
            }
        }

        return res;

    }
}
