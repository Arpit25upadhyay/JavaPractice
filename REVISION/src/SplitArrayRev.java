public class SplitArrayRev {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(minimizedSum(nums, k));
    }

    public static int minimizedSum(int[] nums, int k){
        int start = maxEle(nums);
        int end = sum(nums);
        while(start < end){
            int mid = start + (end-start)/2;
            if(subArrayCount(nums,mid)<= k){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public static int subArrayCount(int[] arr, int mid){
        int count = 1;
        int sum = 0;
        for(int n : arr){
            sum+=n;
            if(sum > mid){
                count++;
                sum = n;
            }
        }
        return count;
    }

    public static int maxEle(int[] arr){
        int max = arr[0];
        for(int n : arr){
            max = Math.max(max, n);
        }
        return max;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int n : arr){
            sum+=n;
        }
        return sum;
    }
}
