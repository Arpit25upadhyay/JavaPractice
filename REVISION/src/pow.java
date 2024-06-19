import java.util.*;

public class pow {
    static long mod = 1000000007;

    public static void main(String[] args) {
        int[] arr = {9, 9, 5, 6, 10, 9, 10, 9, 9, 7};

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int a = (int) (power(arr[i], arr[i + 1]) % mod);
            res.add(a);
        }

        System.out.println(res);

        // Find min index of largest value
        int maxVal = Integer.MIN_VALUE;
        int minIndex = -1;
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) > maxVal) {
                maxVal = res.get(i);
                minIndex = i;
            }
        }

        System.out.println("Minimum index of largest value: " + minIndex);
    }

    public static int power(int n, int p) {
        if (p == 0) return 1;
        int newN = (int) (((n % mod) * (n % mod)) % mod);
        if (p % 2 == 0) return power(newN, p / 2);
        return n * power(newN, p / 2);
    }
}
