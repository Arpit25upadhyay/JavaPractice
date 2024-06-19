//1802. Maximum Value at a Given Index in a Bounded Array
public class maxValueBounded {
    public static void main(String[] args) {
        int n = 6;
        int index = 1;
        int maxSum = 10;
        System.out.println(maxValue(n,index,maxSum));
    }


    public static int maxValue(int n, int index, int maxSum) {
        return binarySearch(n, index, maxSum);
    }
    public static int binarySearch(int n, int idx, int maxSum){
        int start = 1;
        int end = maxSum;
        int res = 0;


        while (start<=end){
            int mid = start+(end-start)/2;

            //left_sum =  sumOfNaturalNos. + remaining ele
            int left_Sum  = (int)sum(Math.min(idx, mid-1), mid) + Math.max(0, (idx - (mid-1)));

            int right_Sum = (int)sum(Math.min(n-idx-1, mid-1), mid) + Math.max(0, (n-idx-1 - (mid-1)));
            int total = left_Sum+mid+right_Sum;
            if(total > maxSum){
                end = mid -1;
            }else{
                res = Math.max(mid, res);
                start = mid+1;
            }
        }
        return res;
    }

    public static long sum(long count, long x){
        return  (count * x) - (count * (count+1)/2);
    }


}
