//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/977035293/
public class RBS {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int target = 0;
        int pivot = findPivotDuplicate(arr);

        if(pivot == -1){
            //no rotation
            System.out.println((binarySearch(arr, target, 0, arr.length-1)));
        }

        else if(arr[pivot] == target){
            System.out.println(pivot);
        }
        else if(target >= arr[0]){
            //reducing the search space
            //searching on the left side
            // as array in asc order on both side of pivot
            //arr = [3,4,6,7,0,1], target is 6 and pivot is 7 so to search 6 best array is [3,4,6] i.e 0 to pivot-1
            System.out.println((binarySearch(arr, target, 0, pivot-1)));
        }else{
            //arr = [3,4,6,7,0,1], target is 1 and pivot is 7 so to search 1 best array is [0,1] i.e pivot+1 to end
            System.out.println((binarySearch(arr, target, pivot+1, arr.length-1)));
        }


    }


    static int findPivot(int[] arr){
        int start = 0, mid=0;
        int end =  arr.length-1;

        while(start<= end){
            mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int findPivotDuplicate(int[] arr){
        int start = 0, mid=0;
        int end =  arr.length-1;

        while(start<= end){
            mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot is on right side
            else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid]>arr[end])) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
