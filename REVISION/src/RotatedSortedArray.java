public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr= {3,5,1};
        int target = 3;
        //System.out.println(arr[findPivot(arr)]);
        System.out.println(rotatedSearch(arr, target));
    }

    public static int rotatedSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid] == target) return mid;

            if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid]) end=mid-1;
                else start = mid+1;

            }else{
                if(arr[mid] < target && target <= arr[end]) start = mid+1;
                else end= mid-1;
            }
        }

        return -1;
    }

   public static  int findPivot(int[] arr){
        int start = 0;
        int end= arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]) return mid;

            if(mid > start && arr[mid-1] > arr[mid]) return mid-1;

            if(arr[start] > arr[mid]) end = mid-1;
            else start =mid+1;
        }

        return -1;
   }
}
