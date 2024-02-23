public class SegmentOfOnes {
    public static void main(String[] args) {
        String s = "1";

        System.out.println(checkOnesSegment(s));

    }

    public static boolean checkOnesSegment(String s) {

        for(int i = 0; i< s.length()-1;  i++){
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                return true;
            }

        }
        return false;
    }
}
