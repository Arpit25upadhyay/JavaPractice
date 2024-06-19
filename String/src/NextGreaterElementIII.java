import java.lang.reflect.Array;
import java.util.Arrays;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n = 12;

        String s = String.valueOf(n);
        String[] arr = s.split("");

        if(largestIdx(arr) == 0){
            System.out.println( -1);
        }
        else{
            Arrays.sort(arr);
            System.out.println( Integer.parseInt(String.join("", arr)));
        }


    }

    public static int largestIdx(String[] arr){
        int largeIdx = 0;
        for(int i = 1; i<arr.length; i++){
            if(Integer.parseInt(arr[largeIdx]) < Integer.parseInt(arr[i])){
                largeIdx = i;
            }
        }
        return largeIdx;
    }

}
