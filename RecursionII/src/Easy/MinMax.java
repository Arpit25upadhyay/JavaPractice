package Easy;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,4,3,-5,-4,8,6};
        int min = minValue(arr,0, Integer.MAX_VALUE);
        int max = maxValue(arr, 0, Integer.MIN_VALUE);
        System.out.println( "min = " + min + ", max = " + max );
    }


    public static int minValue(int[] arr, int i, int min){
        //last index
        if(i == arr.length){
            return min;
        }
        min = Math.min(min, arr[i]);
        return minValue(arr, ++i, min);
    }

    public static int maxValue(int[] arr, int i, int max){
        if(i == arr.length){
            return max;
        }
        max = Math.max(max, arr[i]);
        return maxValue(arr, ++i, max);
    }
}
