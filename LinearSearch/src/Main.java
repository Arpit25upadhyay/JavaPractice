public class Main {
    public static void main(String[] args) {
        System.out.println(LinearSearch(new int[]{1,2,4}, 4));
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i =0 ; i<arr.length; i++){
            if(arr[i] ==  target){
                return i;
            }
        }

//        for(int a : arr){
//            if(a == target){
//                return a;
//            }
//        }

        return -1;
    }
}