public class ListReArrange {
    public static void main(String[] args) {
        ListNode head = null;
        head = addNode(1, head);
        head = addNode(2, head);
        head = addNode(3, head);
        head = addNode(4, head);
        //head = addNode(5, head);

        System.out.println("Original List:");
        printList(head);

        reorderList(head);

        System.out.println("Reordered List:");
        printList(head);
    }
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getMid(head);

        ListNode hs = reverse(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    private static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    private static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Utility method to add a node at the end of the list
    public static ListNode addNode(int value, ListNode head) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
