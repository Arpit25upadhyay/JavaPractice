import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{3,1,2}, new int[]{1,1})));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        for(int n1 : nums1){
            for(int n2 : nums2){
                if(n1 == n2){
                    res.add(n2);
                    break;
                }
            }
        }

        int[] op = new int[res.size()];

        for (int i= 0; i < res.size(); i++){
            op[i] = res.get(i);
        }
        return op;
    }
}

