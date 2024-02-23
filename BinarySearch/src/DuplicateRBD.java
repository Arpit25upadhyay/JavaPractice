//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class DuplicateRBD {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = 0;

        if(nums.length >= 2){
            pivot = findPivot(nums);
        }

        if(pivot == -1){
            return binarySearch(nums, 0,nums.length-1, target);
        }

        if(nums[pivot] == target){
            return true;
        }

        if(target >= nums[0]){
            //bcoz all the no. after pivot are smaller than start
            return binarySearch(nums, 0, pivot-1, target);
        }else{
            return binarySearch(nums, pivot+1, nums.length-1 , target);
        }

    }

    public static boolean binarySearch(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return true;
            }

            if(target > arr[mid]){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }





    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if(arr[start]== arr[mid] && arr[end] == arr[mid]){
                if(arr[start]>arr[start+1]){ //check start as pivot
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){ //checking end as pivot
                    return end-1;
                }
                end--;
            }
            else if(arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
