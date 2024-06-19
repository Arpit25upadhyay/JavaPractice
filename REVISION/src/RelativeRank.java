import java.util.Arrays;

public class RelativeRank {
    public static void main(String[] args) {
        int[] nums = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(nums)));
    }
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[][] arr = new int[n][];

        for(int i = 0; i<n; i++){
            arr[i] = new int[]{score[i], i};
        }

        Arrays.sort(arr, (a,b) -> a[0]-b[0]);

        for(int j = 0; j<n; j++){

            if(j == 0){
                ans[arr[n-j-1][1]] = "Gold Medal";
            }else if(j == 1){
                ans[arr[n-j-1][1]] = "Silver Medal";
            }else if(j == 2){
                ans[arr[n-j-1][1]] = "Bronze Medal";
            }else{
                ans[arr[n-j-1][1]] = Integer.toString(j+1);
            }
        }

        return ans;
    }
}
