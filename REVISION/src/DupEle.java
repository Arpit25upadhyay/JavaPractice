public class DupEle {
    public static void main(String[] args) {
        int[] a = {4,3,1,4,2};
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[nums[i]-1] != nums[i]){
                swap(nums, i);
            }else{
                i++;
            }
        }
        return nums[nums.length-1];

    }

    public static void swap(int[] nums, int i){
        int temp  =  nums[nums[i]-1];
        nums[nums[i]-1] = nums[i];
        nums[i] = temp;
    }
}
