import java.lang.reflect.Array;
import java.util.Arrays;

public class AvgSalary {
    public static void main(String[] args) {
        System.out.println(average(new int[]{4000,3000,1000,2000}));
    }
    public static double average(int[] salary) {

        double sum = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;

        for(int i = 0; i <salary.length; i++) {
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }


        return (double)(sum - max - min) / (salary.length-2);
    }
}
