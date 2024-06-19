public class rotatedArraySearchII {
    public static void main(String[] args) {
        int[] a = {1,0,1,1,1};
        int pivot = findPivotDuplicate(a);
        System.out.println(pivot);
    }

    private static int findPivotDuplicate(int[] a) {
        int start = 0;
        int end = a.length-1;

        while(start<= end){
            int mid = start + (end-start)/2;
            //skipping duplicates

            if(mid < a.length-1 && a[mid] > a[mid+1]){
                return mid;
            }
            if(mid> start && a[mid]< a[mid-1]){
                return mid-1;
            }
            if(a[mid] == a[start] && a[mid] == a[start]){
                if(a[start] > a[start+1]){
                    return start;
                }
                if(a[end] < a[end-1]){
                    return end-1;
                }
                start++;
                end--;
            }



            if(a[mid] < a[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
