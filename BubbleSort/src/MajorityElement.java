import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }
    public static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //int count = 0;
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }else{
                map.replace(n, map.get(n)+1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
