public class kokoBanana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        int minBanana = binarySearch(piles, h);
        System.out.println(minBanana);
    }

    public static int binarySearch(int [] arr, int h){
        int start = 1;
        int end = maxEle(arr);
        while(start<end){
            int mid = start + (end-start)/2;
            int timeTaken = timeTakenMid(arr, mid);
            if(timeTaken>h){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return start;
    }

    private static int timeTakenMid(int[] arr, int mid) {
        int totalTime = 0;
        for(int n : arr){
            totalTime += n/mid;
            if(n%mid != 0){
                totalTime++;
            }
        }
        return totalTime;
    }


    private static int maxEle(int[] nums) {
        int max = nums[0];
        for(int n: nums){
            if(n > max){
                max = n;
            }
        }
        return  max;
    }
}
