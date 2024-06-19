//Find position of an element in a sorted array of infinite numbers
public class InfiniteArray {
    public static void main(String[] args) {
        int[] a =  {1,2,3,4,5,6,7,8,12,14,16,18,20,22,40,44,66,77,88,99,100};
        int target = 99;
        System.out.println(searchInfinity(a,target));
    }

    public static int searchInfinity(int[] arr, int target){
        int start = 0;
        int end = 1;


        while(start <= end){
            if(target <= arr[end]){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                if(target>arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                //doubling the size of array range to find target element
                //s  e
                //[1,2,3,4,5,6,7,8,12,14,16,18,20,22,40,44,66,77,88,99,100]
                //     s     e
                //             s                  e
                int tempEnd = (end-start)*2+1;
                start = end+1;
                end = start + tempEnd;
            }
        }
        return -1;
    }
}
