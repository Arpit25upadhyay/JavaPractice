import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] ans = {-1,-1};
        int target = 8;
        ans[0] = binarySearch(arr,target, true);
        ans[1] = binarySearch(arr,target, false);

        System.out.println(Arrays.toString(ans));
    }

    public static int binarySearch(int[] arr, int target, boolean leftIdx){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int  mid = start+(end-start)/2;

            if(target> arr[mid]){
                start = mid+1;
            }else if(target< arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(leftIdx){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
