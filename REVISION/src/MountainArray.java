public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        int peak = findPeak(arr);
        //int peak2 = findPeak2(arr);
        System.out.println(arr[peak]);
        //System.out.println(arr[peak2]);

    }

    public static int findPeak2(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start  +(end - start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }


    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid>0 && mid < arr.length-1 && arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) return mid;

            else if(arr[mid]< arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return  -1;
    }
}
