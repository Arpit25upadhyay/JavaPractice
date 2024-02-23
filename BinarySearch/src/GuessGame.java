public class GuessGame {
    public static void main(String[] args) {
        System.out.println(binarySearch(1000,50));
    }

    public static int binarySearch(int n, int target){
        int start = 0;
        int end = n;
        int mid =0;
        while(start <= end){
            mid = start + ((end-start)/2);
            if(target > mid){
                start = mid+1;
            }else if(target < mid){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
