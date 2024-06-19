public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {312884470};
        int h = 312884469;
        int ans = findMinSpeed(piles, h);
        System.out.println(ans);
    }

    private static int findMinSpeed(int[] piles, int h) {
        int start = 1;
        int end = maxArr(piles);
        int ans = end;
        while (start< end){
            int mid = start + (end-start)/2;
            int actualHour = timeTaken(piles, mid);
            if(actualHour > h){
                start = mid+1;
            }else {
                ans = Math.min(ans,mid);
                end = mid;
            }
        }
        return ans;
    }

    private static int timeTaken(int[] piles, int speed) {
        int count = 0;
        for(int b : piles){
            count += b/speed;
            if(b%speed != 0){
                count++;
            }
        }
        return  count;
    }

    private static int maxArr(int[] piles) {
        int maxEle = piles[0];
        for(int a : piles){
            maxEle = Math.max(a, maxEle);
        }
        return maxEle;
    }
}
