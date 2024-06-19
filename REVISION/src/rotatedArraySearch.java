public class rotatedArraySearch {
    public static void main(String[] args) {
        int [] a = {1};
        int t = 1;
        int pivot = findPivotII(a);
        int idx = binarySearch(a, 0, pivot, t);
        if(idx == -1){
            System.out.println(binarySearch(a, pivot+1, a.length-1, t));
        }else{
            System.out.println(idx);
        }


    }
    public static int binarySearch(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    private static int findPivot(int[] a) {
        int start = 0;
        int end = a.length-1;

        while(start<=end){
            if(start < a.length-1 && a[start] > a[start+1]){
                return start;
            }
            if(end < 0 && a[end] < a[end-1]){
                return end-1;
            }

            int mid = start + (end-start)/2;

            if(mid> start && mid< end && a[mid]> a[mid+1] && a[mid]> a[mid-1]){
                return mid;
            }
            if(a[mid]> a[start]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    private static  int findPivotII(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){


        int mid = start+(end - start)/2;

        //only this condition --- when idx i is greater then next element
        if(mid < end && nums[mid] > nums[mid+1]){
            return mid;
        }
        if(mid > start && nums[mid] < nums[mid-1]){
            return mid-1;
        }
        if(nums[start] >=  nums[mid]){
            end = mid-1;
        }else{
            start= mid+1;
        }
    }
        return -1;
    }
}
