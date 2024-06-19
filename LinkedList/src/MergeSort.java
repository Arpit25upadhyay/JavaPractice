class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeSort {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode tail = head;

        for(int i = 0; i<4; i++){
            tail.next = new ListNode(4-i);
            tail = tail.next;
        }

        sortList(head.next);
    }

    public static ListNode sortList(ListNode head){

        if(head == null || head.next == null) return  head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode rigth = sortList(mid);

        return merge(left, rigth);
    }


    public static ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(left != null && right != null){
            if(left.val< right.val){
                tail.next = left;
                left = left.next;
                tail = tail.next;
            }else{
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
        }

        tail = left != null? left : right;
        return dummyHead.next;
    }

    public static ListNode getMid(ListNode head){
        ListNode midPrev = null;

        while(head != null && head.next!= null){
            midPrev = (midPrev == null)? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

}
