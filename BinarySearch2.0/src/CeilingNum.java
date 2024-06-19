//smallest element in array greater or == target
public class CeilingNum {
    public static void main(String[] args) {
        int[] a = {2,3,5,9,14,16,18};
        System.out.println(ceilingNumber(a,1));
    }

    static int ceilingNumber(int [] arr, int target){
         int start = 0;
         int end = arr.length-1;

        if(target > arr[end]){
            return  -1;
        }
         //e m s
         while(start<=end){
             int mid = start  + (end-start)/2;
             if(arr[mid] == target){
                 return arr[mid];
             }
             if(arr[mid]>target){
                 end = mid-1;
             }else {
                 start = mid+1;
             }
         }
         return arr[start];
    }
}
