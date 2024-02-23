public class ArraySum {
    public static void main(String[] args) {
        int[] res=new int[2];
        int[] numbers = {2,7,11,15};
        int start = 0;
        int end = numbers.length-1;
        int target= 9;
        while(start < end){
            if(numbers[start]+numbers[end] > target){
                end--;
            }else if(numbers[start]+numbers[end] < target){
                start++;
            }else{
                res[0] = start+1;
                res[1] = end;
                //return res;
                System.out.println(res);
            }
        }
        System.out.println(res);
    }
}
