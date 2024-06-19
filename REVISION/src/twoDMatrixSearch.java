public class twoDMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }

    public static boolean binarySearch(int[][] arr, int target){
        int rStart = 0;
        int cStart = arr[0].length -1;
        while(rStart < arr.length && cStart >=0){
            if(arr[rStart][cStart] == target){
                return true;
            }
            if(arr[rStart][cStart] < target){
                rStart++;
            }else{
                cStart--;
            }
        }
        return false;
    }
}
