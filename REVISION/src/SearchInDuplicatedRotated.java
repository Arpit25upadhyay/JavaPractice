public class SearchInDuplicatedRotated {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int T = 0;
        int pivot =  findPivotInDup(arr);
        System.out.println(arr[pivot]);
        if(arr[pivot] == T){
            System.out.println(true);
        }else {
            boolean targetFound = binarySearchInRange(arr,0, pivot,T);
            if(!targetFound){
                System.out.println(binarySearchInRange(arr,pivot+1, arr.length-1,T));
            }else{
                System.out.println(targetFound);
            }

        }

    }

    private static boolean binarySearchInRange(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return true;
            } else if (arr[mid] > target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }

    private static int findPivotInDup(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid-1] > arr[mid]){
                return mid-1;
            }
            //if start == mid ==end => skip duplicates
            if(arr[start] == arr[mid] && arr[mid]== arr[end]){
                //check if start and end are pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }

            if(arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end= mid+1;
            }

        }
        return -1;
    }


}
