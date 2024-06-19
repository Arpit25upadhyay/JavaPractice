import java.util.Arrays;

public class MaxHappiness {
    public static void main(String[] args) {
        int[] h = {1,2,3};

        //System.out.println(maximumHappinessSum(h, 2));
    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n  = happiness.length;
        long sum = happiness[n-1];
        k--;
        int i = n-2;
        while(k>0 && i>=0){
            sum += happiness[i];
            
        }

        return sum;

    }
}
