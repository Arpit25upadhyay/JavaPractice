import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n =3;
        int j = 0;
        int[] arr = new int[2*n];
        for(int i = 0; i< (arr.length -1); i=i+2){
            arr[i] = nums[j];
            arr[i+1] = nums[n];
            j++;
            n++;
        }


//        int[] arr = new int[nums.length];
//        int j=0;
//        int k=n;
//        for(int i=0;i<n*2;i+=2)
//        {
//            arr[i]=nums[j++];
//        }
//        for(int i=1;i<n*2;i+=2)
//        {
//            arr[i]=nums[k++];
//        }
//        return arr;





        System.out.println(Arrays.toString(arr));
    }
}
