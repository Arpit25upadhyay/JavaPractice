public class peakMountain {
    public static void main(String[] args) {
        int[] a = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(a));
        System.out.println(findPeak(a, a.length));
        System.out.println(findPeak(a));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int peak;
        while(start != end){
            int mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    public static int findPeak(int[] arr, int n){
        int start = 0;
        int end = n-1;
        while (start<end){
            int mid = start +(end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }

    public static int findPeak(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            //remove duplicate
            if(start < end && arr[start] == arr[end]){
                start++;
                end--;
            }
            int mid = start + (end-start)/2;

            if(mid >0 && mid < n-1 && arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }else if(mid>0 && arr[mid-1]  < arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
