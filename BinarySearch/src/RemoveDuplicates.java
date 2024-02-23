public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    public static int removeDuplicates(int[] nums) {
        int c = 0;
        for(int i =0; i<nums.length; i++){
            if(i<nums.length-1 && nums[i]!= nums[i+1]){
                c++;
            }
            if(i == nums.length-1){
                c++;
            }
        }
        return c;

    }
}
