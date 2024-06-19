public class twoDSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int t = 60;
        System.out.println(binaySearchTwoD(arr, t));
    }

    private static boolean binaySearchTwoD(int[][] arr, int t) {
        int start = 0;
        int end = arr[0].length -1;
        while(start < arr.length && end>=0){
            if(arr[start][end] == t){
                return  true;
            } else if (arr[start][end]  > t) {
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}
