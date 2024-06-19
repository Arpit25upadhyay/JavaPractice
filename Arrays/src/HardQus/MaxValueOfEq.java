package HardQus;

public class MaxValueOfEq {
    public static void main(String[] args) {
        int[][] arr = {{0,0},{3,0},{9,2}};
        int k = 3;
        System.out.println(maxValue(arr, k));
    }

    public static int maxValue(int[][] arr, int k){
        int ans = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(arr[i][0] - arr[j][0]) <= k){
                    int sol = arr[i][1] + arr[j][1] + Math.abs(arr[i][0] - arr[j][0]);
                    ans = Math.max(ans, sol);
                }
            }
        }
        return ans;
    }
}
