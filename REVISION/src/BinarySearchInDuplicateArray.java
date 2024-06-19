public class BinarySearchInDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,2,3,3,4,5,6,6};
        int T = 3;
        boolean found = binarySearchInDuplicate(arr,T);
        System.out.println(found);
    }

    public static boolean binarySearchInDuplicate(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return true;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;

    }

}
