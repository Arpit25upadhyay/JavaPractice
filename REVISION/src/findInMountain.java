public class findInMountain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int n = arr.length;
        int peak = findPeak(arr,n);
        if(arr[peak] ==  target){
            System.out.println("peak is : " + peak);
        }
        int leftIdx = binarySearch(arr, 0, peak, target, true);
        if(leftIdx == -1){
            System.out.println(binarySearch(arr, peak+1, n-1, target, false));
        }else{
            System.out.println(leftIdx);
        }


    }
    public static int findPeak(int[] arr, int n){
        int start = 0;
        int end = n-1;
        while (start<end){
            int mid = start +(end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start++;
            }else{
                end--;
            }
        }
        return end;
    }

    public static  int binarySearch(int[] arr, int start, int end, int t, boolean leftIdx){
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == t){
                return mid;
            }
            if(leftIdx){
                if(arr[mid] > t){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid] > t){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        return -1;
    }
}
