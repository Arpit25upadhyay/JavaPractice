import Custom.CustomQueue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(5);
        queue.insert(1);
        queue.insert(15);
        queue.insert(53);
        queue.insert(25);

        queue.display();

        System.out.println(queue.remove());

        queue.display();

    }
}
