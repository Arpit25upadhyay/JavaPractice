//1838. Frequency of the Most Frequent Element
public class MostFreq {
    public static void main(String[] args) {
        int[] a = {1,4,8,13};
        int k = 5;
        int result = 0;
        int[] prefixSum = new int[a.length];
        prefixSum[0] = a[0];
        for(int i = 1; i<a.length; i++){
            prefixSum[i] = prefixSum[i-1]+a[i];
        }
        for(int i = 0; i<a.length; i++){
            result = binarySeach(a,i, k, prefixSum);
        }
        System.out.println(result);
    }

    public static  int binarySeach(int[] arr, int targetIdx, int maxOps, int[] prefixSum){
        int res = 0;
        int start = 0;
        int end = targetIdx;
        while(start<=end){
            int mid = start + (end-start)/2;
            long windowSum = ((targetIdx - mid) + 1) * arr[targetIdx];
            long ogSum = prefixSum[targetIdx] - prefixSum[mid] + arr[mid];
            long reqOps = windowSum-ogSum;

            if(reqOps>maxOps){
                start = mid+1;
            }else{
                res = ((targetIdx - mid) + 1);
                end = mid-1;
            }
        }
        return res;
    }
}
