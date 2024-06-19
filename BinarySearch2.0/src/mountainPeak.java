public class mountainPeak {
    public static void main(String[] args) {
        System.out.println(findPeak(new int[] {3,5,3,2,0}));
//        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//        System.out.println(findPeak(arr));

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
                end = mid;
            }
        }
        return -1;
    }

}
