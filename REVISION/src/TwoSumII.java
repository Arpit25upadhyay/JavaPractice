import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr= {2,7,11,15};
        int t = 9;
        //int[] ans = new int[2];
//        for(int i = 0; i <= n-2; i++){
//            ans[0] = arr[i];
//            ans[1] = binarySearch(arr, i+1 , n-1, t-arr[i]);
//        }
        System.out.println(Arrays.toString(binarySearch(arr,t)));
    }

    public static int[] binarySearch(int[] arr, int target){
        int n = arr.length;
        for(int  i =0 ; i<=n-2; i++){
            int x = arr[i];
            int start = i+1;
            int end = n-1;
            while(start<=end){
                int mid = start + (end-start)/2;

                if(arr[mid] == target-x){
                    return new int[]{x, arr[mid]};
                }
                if(arr[mid] > target){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return  new int[]{-1,-1};

    }

}
