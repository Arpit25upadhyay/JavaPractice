import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }
    public static String largestNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum == 0) return "0";

        int n = nums.length;
        //create String Arr
        String arr[] = new String[n];
        int k=0;
        for(int i : nums){
            arr[k++] = Integer.toString(i);
        }

        Arrays.sort(arr, (x, y) -> {
            String xy = x+y;
            String yx = y+x;
            return yx.compareTo(xy);
        });


        StringBuilder sb = new StringBuilder();
        for (String s : arr)
            sb.append(s);

        return sb.toString();

    }
}
