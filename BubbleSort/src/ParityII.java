public class ParityII {
    public static void main(String[] args) {

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int i = 0;
        int j = 1;
        int k = 0;

        if(n>2){
            while(k<n){
                if(k%2 == 0 && nums[i]%2 == 0){
                    res[k] = nums[i];
                    i = i+2;
                }
                else{
                    res[k] = nums[j];
                    j = j+2;
                }
                k++;
            }

        }

        return res;

    }
}
