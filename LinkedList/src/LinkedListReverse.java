class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListReverse {
    Node head;

    // Method to reverse the linked list recursively
    private void reverse(Node node) {
        // Base case: if the node is the last node, update head and return
        if (node.next == null) {
            head = node;
            return;
        }

        // Recursively reverse the rest of the list
        reverse(node.next);

        // Adjust the next pointers
        node.next.next = node;
        node.next = null;
    }

    // Utility method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Utility method to add a node at the end of the list
    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original List:");
        list.printList();

        list.reverse(list.head);

        System.out.println("Reversed List:");
        list.printList();
    }
}

