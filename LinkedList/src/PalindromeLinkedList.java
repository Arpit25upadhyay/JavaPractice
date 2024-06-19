public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode d = new ListNode(1, null);
        ListNode c = new ListNode(2, d);
        ListNode b = new ListNode(2, c);
        ListNode head = new ListNode(1, b);

        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode mid = getMid(head);
        reverse(mid);

        ListNode i = head;
        ListNode j = mid.next;
        while(i != mid.next){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }

    public static void reverse(ListNode mid){
        ListNode last = mid;
        ListNode prev = null;
        ListNode curr = mid.next;
        ListNode nxt  = mid.next != null ? mid.next.next : null;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
        }

        last.next = prev;
    }


    public static ListNode getMid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        ListNode midPrev = null;
        while(f != null && f.next != null){
            midPrev = s;
            s = s.next;
            f = f.next.next;
        }
        return midPrev;
    }
}
