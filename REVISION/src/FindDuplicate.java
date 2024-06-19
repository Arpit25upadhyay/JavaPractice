public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {4,3,1,4,2};

        int n = arr.length;

        int i = 0;

        while(i<n){
            while(arr[arr[i]-1] != arr[i]){
                swap(arr, i);
            }
            i++;
        }

        System.out.println(arr[n-1]);
    }

    public static void swap(int[] arr, int i){
        int temp = arr[arr[i]-1];
        arr[arr[i]-1] = arr[i];
        arr[i] = temp;
    }
}
