public class MaxNumRemovable {
    public static void main(String[] args) {
        String s = "qlevcvgzfpryiqlwy";
        String p = "qlecfqlw";
        int[] removable = {12, 5};
        System.out.println(maximumRemovals(s,p, removable));
    }
    public static int maximumRemovals(String s, String p, int[] removable) {
        int start = 0;
        int end = removable.length -1;
        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            char[] newString = remove(s, removable, mid);

            boolean isPresent = checkSubSeq(newString, p);

            if(isPresent){
                ans = mid+1;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static char[] remove(String s, int[] removable, int mid){

        char[] arr = s.toCharArray();

        for(int i = 0; i<=mid; i++){
            arr[removable[i]] = '&';
        }

        return arr;

    }

    public static boolean checkSubSeq(char[] arr, String p){

        int c = 0;
        int i = 0;

        while(i< arr.length){
            if(c<p.length() && arr[i] == p.charAt(c)) c++;
            i++;
        }

        return c == p.length();
    }

}
