// https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
public class ReverseKAlternateNode {
    public static void main(String[] args) {

    }

    public static ListNode reverseKAlt(ListNode head, int k){
        if(k<=1 && head == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode last = prev;
            ListNode newEnd = curr;
            ListNode nxt = curr.next;

            for(int i = 0; curr!= null && i<k; i++){
                curr.next = prev;
                prev = curr;
                curr = nxt;
                nxt = nxt != null ? nxt.next: null;
            }

            newEnd.next = curr;

            if (last == null) head = prev;
            else last.next = prev;


            for (int i = 0; curr!= null &&  i < k ; i++) {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
