public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int target = 8;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }
    }
}
