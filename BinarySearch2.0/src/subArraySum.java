//https://leetcode.com/problems/split-array-largest-sum/
public class subArraySum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = maxEle(nums);
        int end = totalSum(nums);


        while(start<end){
            int mid = start + (end-start)/2;
            int subArrayCount = subArray(nums, mid);
            if(subArrayCount <= k){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;

    }

    public static int subArray(int[] arr, int t){
        int subArrayCount = 1;
        int sum =0;
        for(int i = 0 ; i< arr.length;i++){
            sum+= arr[i];
            if(sum > t){
                subArrayCount++;
                sum=arr[i];
            }
        }
        return subArrayCount;
    }

    public static int maxEle(int[] arr){
        int maxEle = arr[0];
        for(int n : arr){
            maxEle = Math.max(maxEle,n);
        }
        return maxEle;
    }

    public static int totalSum(int[] arr){
        int sum=0;
        for(int n : arr){
            sum+=n;
        }
        return sum;
    }

}
