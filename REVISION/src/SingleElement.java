//https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/984460980/
public class SingleElement {
    public static void main(String[] args) {
        int [] arr = {1,1,2};
        int n = arr.length-1;
        int singleEle = binarySearch(arr, 0, n);
        System.out.println(singleEle);
    }

    public static int binarySearch(int[] arr, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid > 0 && mid < arr.length && arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
            if(mid%2 == 0){
                if(arr[mid] == arr[mid+1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(arr[mid] == arr[mid-1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }

            }

        }
        return -1;
    }
}
