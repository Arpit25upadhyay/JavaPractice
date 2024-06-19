package Easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,10};
        System.out.println(binarySearch(arr,8,0,arr.length-1));
    }

    public static  boolean binarySearch(int[] arr, int T, int start, int end){

        int m = start+(end-start)/2;
        //base condition
        if(start>end) {
            return false;
        }
        if(T == arr[m]){
            return true;
        }
        //Recursive calls
        if( T > arr[m]){
            return binarySearch(arr,T, m+1, end);
        }else{
            return binarySearch(arr,T,start, m-1);
        }
    }
}
