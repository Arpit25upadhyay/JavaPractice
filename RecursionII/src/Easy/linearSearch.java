package Easy;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {
    static int target = 4 ;
    static List<Integer> staticList = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        System.out.println(search(arr, 0));
        System.out.println(searchII(arr, 0));

        int[] arr2 = {1,3,2,4,4,5};

        //list passed in parameter
        List<Integer> l = new ArrayList<>();
        System.out.println("list passed in parameter " + searchAllIdx(arr2, 0, l));

        //list passed globally
        System.out.println("list passed globally " + searchAllIdxGlobalList(arr2, 0));

        //list passed in body
        System.out.println("list passed in body  " + searchAllIdxBody(new int[]{1,3,2,4,4,5}, 0));
    }



    public static int search(int[] arr, int i){
        if(arr[i] == target) return i;
        if(i == arr.length-1) return -1;
        return  search(arr, ++i);
    }

    public static int searchII(int[] arr, int i){
        if(i == arr.length-1) return -1;
        return arr[i] == target ? i : searchII (arr, ++i);
    }

    public static List<Integer> searchAllIdx(int[] arr, int i, List<Integer> l){
        if(i == arr.length-1) return l;
        if(arr[i] == target){
            l.add(i);
        };
        return searchAllIdx (arr, ++i, l);
    }

    public static List<Integer> searchAllIdxGlobalList(int[] arr, int i){
        if(i == arr.length-1) return staticList;
        if(arr[i] == target){
            staticList.add(i);
        };
        return searchAllIdxGlobalList (arr, ++i);
    }

    private static ArrayList searchAllIdxBody(int[] arr, int i) {
        ArrayList<Integer> bodyList = new ArrayList<>();

        if(i == arr.length){
            return bodyList;
        }

        //ans for that fn call only
        if(arr[i] == target){
            bodyList.add(i);
        };

        List<Integer> ansfromBelowCalls = searchAllIdxBody(arr, ++i);
        bodyList.addAll(ansfromBelowCalls);

        return bodyList;
    }
}
