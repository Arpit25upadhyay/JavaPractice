import java.util.ArrayList;
import java.util.List;

public class PrintSubSeq {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 2;

        findSubSeq(0, arr, sum, new ArrayList<>());

        findOneSubSeq(0, arr, sum, new ArrayList<>());
    }

    public static void findSubSeq(int i, int[] arr, int sum, List<Integer> l){
        if(i == arr.length){
            if(sum == 0){
                System.out.println(l);
            }
            return;
        }

        if(sum == 0){
            System.out.println(l);
            return;
        }
        l.add(arr[i]);
        findSubSeq(i+1, arr, sum- arr[i],l );
        l.remove(l.size()-1);

        findSubSeq(i+1,arr, sum, l);
    }


    public static boolean findOneSubSeq(int i, int[] arr, int sum, List<Integer> l){
        if(i == arr.length){
            if(sum == 0){
                System.out.println(l);
                return true;
            }
            return false;
        }

        if(sum == 0){
            System.out.println(l);
            return true;
        }
        l.add(arr[i]);
        if(findOneSubSeq(i+1, arr, sum- arr[i],l )) return true;
        l.remove(l.size()-1);

        if(findOneSubSeq(i+1, arr, sum,l )) return true;
        return false;
    }
}
