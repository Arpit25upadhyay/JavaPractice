public class MinNum {
    public static void main(String[] args) {
        int[] a = new int[]{-1,1,3,5,9};
        System.out.println(Min(a));
    }
    static int Min(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for(int i : arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
