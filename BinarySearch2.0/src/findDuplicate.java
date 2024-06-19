public class findDuplicate {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,2};
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] nums) {
        boolean [] arr= new boolean[nums.length];
        for(int num:nums)
        {
            if(arr[num])
            {
                return num;
            }
            else
            {
                arr[num]=true;
            }
        }
        return -1;
    }
}
