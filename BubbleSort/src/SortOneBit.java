import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class SortOneBit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
    }

    public static int[] sortByBits(int[] arr) {
        //ok so for this enginner rule is applied where each number is updated by a the number itself + number of bits in number*(10001) and then we will sort it and then we will take the modulo.

        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }
        return arr;
    }
}

//Algorithm:
// For eg: just take a arra like [0,1,2,3,4,5,6,7,8]
// step 1: After the first for loop...
// it will look like [0,10001,10003,20004,10005,20006,20007,30008,10009] (don't forget to add the number also)
// Step 2:sort the array...
// It, will look like [0,10001,10003,10005,10009,20004,20006,20007,30008]
// step 3: divide the same as 10001
// You, will get the result array...
// Pls,upvote it helps!
