import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeDiff {
    public static void main(String[] args) {
        String[] timePoints = {"01:01","02:01","03:00"};
        System.out.println( findMinDifference(Arrays.asList(timePoints)));

    }
    public static int findMinDifference(List<String> timePoints) {
        Boolean[] minutesArr = new Boolean[1440];
        Arrays.fill(minutesArr, false);
        for(String s : timePoints){
            String[] timeArray = s.split(":");
            int hours = Integer.parseInt(timeArray[0]);
            int mins = Integer.parseInt(timeArray[1]);
            int idx = (hours*60) + mins;

            if(minutesArr[idx] == true) return 0;

            minutesArr[idx] = true;
        }

        int firstTime = -1;
        int nextTime  =-1;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i<1440; i++){
            if(minutesArr[i]){
                if(firstTime == -1){
                    firstTime = i;
                    nextTime = i;
                }else{

                    minDiff = Math.min(minDiff, Math.min(i-nextTime, 1440-i + nextTime));
                    nextTime = i;
                }
            }

        }
        minDiff = Math.min(minDiff, Math.min(nextTime-firstTime, 1440-nextTime + firstTime));
        return minDiff;
    }
}
