import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3}));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();

        for (int n: nums) {
            set.add(n);
        }

        return set.size() < nums.length;
    }
}
