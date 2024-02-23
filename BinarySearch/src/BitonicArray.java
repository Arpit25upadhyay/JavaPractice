public class BitonicArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(binarySearch(arr));
    }
    static int binarySearch(int[]arr){
        int start = 0, mid;
        int end = arr.length-1;

        while(start != end){

            mid = start +(end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else if(arr[mid]< arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
}
