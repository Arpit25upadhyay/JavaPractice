public class unique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int a:arr) {
            unique ^= a;
        }

        return unique;
    }
}
