import java.lang.reflect.Array;
import java.util.Arrays;

public class FreqEle {
    public static void main(String[] args) {
        int [] a ={1,4,8,13};
        int k = 5;
        long[] prefix = new long[a.length];
        prefix[0] = a[0];
        for(int i = 1; i<a.length; i++){
            prefix[i] = prefix[i-1]+a[i];
        }
        System.out.println(maxFrequency(a,k, prefix));

    }
    public static int maxFrequency(int[] nums, int k, long[] prefix) {
        Arrays.sort(nums);
        int result = 1;
        for(int i = 0; i<nums.length; i++){
            int freq = binarySearch(nums, i, k, prefix);
            result = Math.max(freq,result);
        }
        return result;
    }

    public static int binarySearch(int[] nums, int targetIdx, int opsLimit, long[] prefix){
        int start = 0;
        int end = targetIdx;
        int result = 0;

        while(start<=end){
            int mid = start + (end-start)/2;
            int windowEle = targetIdx - mid +1;
            //total sum if every elem is same in that window
            int totalSum = windowEle * nums[targetIdx   ];
            //original sum of that window
            int orgSum = (int) (prefix[targetIdx] - prefix[mid]) + nums[mid];
            //ops Required
            int opsRequired = totalSum - orgSum;

            if(opsRequired <= opsLimit){
                end = mid-1;
                result = mid;
            }else{
                start = mid+1;
            }
        }
        return targetIdx-result+1;

    }

    public static int sum(int[] nums, int start, int end){
        int sum = 0;
        for(int i = start; i<=end; i++){
            sum+=nums[i];
        }
        return sum;

    }
}
