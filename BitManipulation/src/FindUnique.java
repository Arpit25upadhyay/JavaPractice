public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4,6,9};
        int ans = 0;
        for(int n: arr){
            ans = ans^n;
        }
        System.out.println(ans);
    }
}
