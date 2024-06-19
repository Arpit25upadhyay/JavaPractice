package Easy;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        int target = 10;
        int start = 0;
        int end = arr.length-1;
        System.out.println(search(arr, start, end, target));
    }

    public static int search(int[] arr, int s, int e, int t){
        int mid = s + (e - s)/2;


        if(arr[mid] == t) return mid;

        if(s > e) return -1;

        if(arr[s] <= arr[mid]){
            if(arr[s] < t && t< arr[mid]) e = mid-1;
            else s = mid+1;

        }else{
            if(arr[mid] < t && t<arr[e])s = mid+1;
            else e = mid-1;
        }
        return search(arr, s, e, t);
    }
}
