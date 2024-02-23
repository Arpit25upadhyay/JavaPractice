import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            l.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(l.get(i));
        }
        System.out.println(l);


    }
}
