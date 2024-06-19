import java.util.Arrays;

public class time {
    public static void main(String[] args) {
        //System.out.println((char)(1+'0'));
        System.out.println(findLatestTime("1?:?4"));
    }
    public static String findLatestTime(String s) {
        char[] arr = s.toCharArray();

        if (arr[0] == '?') {
            arr[0] = (arr[1] == '?' || arr[1] <= '1') ? '1' : '0';
        }
        if (arr[1] == '?') {
            arr[1] = (arr[0] == '0') ? '9' : '1';
        }


        if (arr[3] == '?') {
            arr[3] = '5';
        }
        if (arr[4] == '?') {
            arr[4] = '9';
        }

        return new String(arr);

    }
}
