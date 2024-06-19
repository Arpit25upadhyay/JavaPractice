public class MaximumRemovals {
    public static void main(String[] args) {
        String s = "abcab";
        String p = "abc";
        int[] rArr = {0,1,2,3,4};
        System.out.println(maxChar(s,p, rArr));
    }

    public static int maxChar(String s, String p, int[] rArr){
        char[] sArr = s.toCharArray();
        int i = 0;
        while(i< rArr.length){
            remove(sArr, rArr[i]);
            if(check(sArr,p)) i++;
            else break;
        }
        return i;
    }

    public static void remove(char[] sArr, int i){
        sArr[i] = '&';
    }

    public static boolean check(char[] sArr, String p){
        int x = 0;
        for(int i = 0; i<sArr.length; i++){
            if(x<p.length() && sArr[i] == p.charAt(x)) x++;
        }

        return x == p.length();
    }

}
