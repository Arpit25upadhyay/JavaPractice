public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int k = 2;
        System.out.println(splitArray(a, k));
    }

    public static int splitArray(int[] nums, int k) {
        //max element of the array--- min Answer of Array
        int start = MaxElement(nums);
        //sum of the array--- max Answer of Array
        int end = arraySum(nums);

        while(start<end){
            int mid = start + (end-start)/2;

            if(subArrayCount(nums, mid) <= k){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    private static int subArrayCount(int[] nums, int mid) {
        int sum = 0;
        int count = 1;
        for(int i : nums){
            sum += i;
            if(sum > mid){
                count++;
                sum = i;
            }
        }
        return count;
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return  sum;
    }

    public static int MaxElement(int []arr){
        int maxEle = arr[0];
        for(int i : arr){
            maxEle = Math.max(maxEle,i);
        }
        return maxEle;
    }


}
