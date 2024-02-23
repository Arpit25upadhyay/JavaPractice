public class CountEvenNum {
    public static void main(String[] args) {
        int[] arr = {2,22,4422,1,53};
        System.out.println("Total " + traverseArr(arr) + " even numbers are in array");
    }

    static int traverseArr(int[] arr){
        int numCount = 0;
        for(int nums : arr){
            if(even(nums)){
                numCount++;
            }
        }
        return numCount;
    }

    static boolean even(int n){
        return countDigit(n)%2==0;
    }

    static int countDigit(int n){
        int count = 0;
        if(n ==0){
            return 1;
        }
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []left =new int[nums.length];
        int []right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[right.length-1] = 1;
        for(int i = nums.length-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }

        int []ans = new int[nums.length];
        for(int i = 0 ; i< nums.length;i++){
            ans[i]=left[i]*right[i];
        }

        return ans;
    }
}
