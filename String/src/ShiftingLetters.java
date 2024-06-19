import java.sql.Array;

public class ShiftingLetters {
    public static void main(String[] args) {
        int[] arr = {3,5,9};
        System.out.println(shiftingLetters("abc", arr));
    }
    public static String shiftingLetters(String s, int[] shifts) {
        char[] sArray = s.toCharArray();

        for(int i = shifts.length-2; i>=0; i--){
            shifts[i] = (shifts[i] + shifts[i+1])%26;
        }

        for(int i = 0; i< shifts.length; i++){
            int a = (sArray[i] - 'a' + shifts[i]);
            sArray[i] = (char)(((a)% 26) + 'a');
        }

        return String.copyValueOf(sArray);
    }
}
