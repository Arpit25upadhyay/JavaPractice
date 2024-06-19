public class FindPeakRevision {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        int peak  = findPeak(arr);

        System.out.println(arr[peak]);

        int idx = binarySearch(arr, 3, 0, peak);

        if(idx ==-1){
            System.out.println(binarySearchRev(arr, 3, peak+1, arr.length-1));
        }
        System.out.println(idx);


    }

    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]) start = mid+1;
            else end = mid;

        }
        return end;
    }


    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target) return mid;

            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchRev(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target) return mid;

            if(arr[mid] > target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
