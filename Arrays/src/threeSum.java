import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int [] a ={-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0};
        for(List l : threeSum(a)){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        int n1;

        int start;
        int end;

        for (int i = 0; i < n-2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            else{
                n1 = nums[i];
                start = i + 1;
                end = n-1;
                while (start < end) {
                    if (start < nums.length - 1 && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    if (end > 0 && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    if (nums[start] + nums[end] > -(n1)) {
                        end--;
                    } else if (nums[start] + nums[end] < -(n1)) {
                        start++;
                    } else {
                        List<Integer> l1 = new ArrayList<>();
                        l1.add(n1);
                        l1.add(nums[start]);
                        l1.add(nums[end]);
                        res.add(l1);
                        start++;
                        end--;
                    }
                }

            }
        }
        return res;

    }
}
