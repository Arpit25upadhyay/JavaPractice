//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,20,21,22,33,44,55,66,77,88,99};
        System.out.println(range(arr,22));
    }
    static int range(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(end < target){
            int newStart = end+1;
            int newEnd = end + 2*(end - start+1);

            start = newStart;
            end = newEnd;
        }

        return binarySearch(arr,target,start, end);
    }

    static int binarySearch(int[] arr, int target, int s, int e){
        int start = s;
        int end = e;
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
