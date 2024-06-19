public class RemovableCha {
    public static void main(String[] args) {
         maximumRemovals("abcacb", "ab", new int[]{3,1,0});
    }
    public static int maximumRemovals(String s, String p, int[] removable) {
        return binarySearch(s, p, removable);
    }

    public static int binarySearch(String s, String p, int[] arr){
        int start = 0;
        int end = arr.length -1;
        int ans = 0;
        while(start<=end){
            int mid  = start +(end-start)/2;

            String upString = remove(s, arr, mid);

//            if(isSubSeq(upString, p)){
//                ans=mid+1;
//                start = mid+1;
//            }else{
//                end = mid-1;
//            }
        }
        return ans;
    }


    public static String remove(String s, int[] arr, int idx){
        String a = s;
        for(int i =0; i<= idx; i++){

        }
        return a;
    }
}
