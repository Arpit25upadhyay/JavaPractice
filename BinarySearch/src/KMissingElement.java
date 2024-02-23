public class KMissingElement {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        int idx = findIdx(arr, n, k);
        int extra = k - arr[idx] - (idx+1);
        //extra arr[idx] + k - arr[idx] + idx +1
        return arr[idx]+extra;
    }

    public static int findIdx(int[] arr,int n,int k){
        int start = 0, mid;
        int end = n-1;

        while(start<=end){
            mid = start+(end-start)/2;

            if((arr[mid] - (mid+1)) < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
}
