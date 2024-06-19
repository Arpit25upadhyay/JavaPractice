public class ReverseKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode tail = head;

        for(int i = 1; i<=8; i++){
            tail.next = new ListNode(i);
            tail = tail.next;
        }



        reverseKGroup(head.next, 3);


        
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 0) return head;

        int size = findSize(head);
        int count = size/k;

        ListNode prev = null;
        ListNode curr = head;

        while(count>0){

            ListNode last = prev;
            ListNode newEnd = curr;
            ListNode next = curr.next;

            for(int i = 0; curr!=null && i<k; i++){
                curr.next = prev;
                prev = curr;
                curr = next;
                next = next!=null? next.next : null;
            }

            if(last == null) head = prev;
            else last.next = prev;

            newEnd.next = curr;
            prev = newEnd;
            count--;
        }
        return head;
    }

    public static int findSize(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
}
