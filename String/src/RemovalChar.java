public class RemovalChar {
    public static void main(String[] args) {
        String s = "abcbddddd";
        String p = "abcd";
        int[] r = {3,2,1,4,5,6};
        System.out.println(maximumRemovals(s, p, r));
    }
    public static int maximumRemovals(String s, String p, int[] removable) {
        return remove(s,p, removable);
    }

    public static int remove(String s, String p, int[] removable){
        int ans = 0;
        int start = 0;
        int end = removable.length-1;
        while(start <= end){
            int mid = start  + (end-start)/2;
            if(subSeq(s, p, removable, mid)){
                ans = mid+1;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static boolean subSeq(String s, String p, int[] removable, int mid){
        char[] cArr = s.toCharArray();
        for(int i =0; i<=mid; i++){
            cArr[removable[i]] = '$';
        }

        int x =0;

        for(char c : cArr){
            if(x< p.length() && p.charAt(x) == c) x++;
        }

        return x == p.length();
    }
}
