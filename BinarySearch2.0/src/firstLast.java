import java.util.Arrays;

public class firstLast {
    public static void main(String[] args) {
        int[] arr = {};
        int t = 0;
        System.out.println(Arrays.toString(new int[]{binarySearch(arr,t, true),
                binarySearch(arr,t,false)}));

    }

    public static int binarySearch(int[]arr, int t, boolean searchFirstIdx){
        int start = 0;
        int end = arr.length-1;
        int idx = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(t>arr[mid]){
                start=mid+1;
            }else if(t<arr[mid]){
                end = mid-1;
            }else{
                idx = mid;
                if(searchFirstIdx){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }
        return idx;
    }
}
