public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }


    private class Node{
        private int value;
        private Node next;

        //constructor
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) tail = head;

        size++;
    }

    public void insertEnd(int val){
        //if no element the insert at start
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertNode(int val, int idx){
        if(idx == 0){
            insertFirst(val);
            return;
        }
        if(idx == size){
            insertEnd(val);
            return;
        }
        Node ptrNode = head;

        for (int i = 1; i < idx; i++) {
            ptrNode = ptrNode.next;
        }

        Node newNode = new Node(val, ptrNode.next);
        ptrNode.next = newNode;
    }

    public void insetRec(int val, int idx){
        //head = insertNodeRec(val, idx, head);
        insetRR(val, idx, head);
    }
    private Node insertNodeRec(int val, int idx, Node node){
        if(idx == 0){
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }

        node.next = insertNodeRec(val, --idx, node.next);
        return node;
    }

    private void insetRR(int val,  int idx, Node cur){
        if(idx == 1){
            Node temp = cur.next;
            Node newNode = new Node(val, temp);
            cur.next = newNode;
            return;
        }

        insetRR(val, --idx, cur.next);
    }

    public void deleteFirst(){
        head = head.next;
        if(head == null) tail = null;
        size--;
    }

    public void deleteTail(){
        Node temp = head;
        for (int i = 0; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void delete(int idx){
        Node prev = head;
        for (int i = 0; i < idx-1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    public int findValue(int val){
       Node temp = head;
       int idx = 0;
       while(temp != null){
           if(temp.value == val){
               return idx;
           }
           temp = temp.next;
           idx++;
       }
       return -1;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void removeDuplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    // returning linkedList completely
    public static LinkedList merge(LinkedList first, LinkedList second){
        Node n1 = first.head;
        Node n2 = second.head;
        LinkedList ans = new LinkedList();
        while (n1 != null && n2 != null){
            if(n1.value <= n2.value){
                ans.insertEnd(n1.value);
                n1 = n1.next;
            }else{
                ans.insertEnd(n2.value);
                n2 = n2.next;
            }
        }

        while(n1 != null){
            ans.insertEnd(n1.value);
            n1 = n1.next;
        }

        while(n2 != null){
            ans.insertEnd(n2.value);
            n2 = n2.next;
        }

        return ans;
    }

    private void reverse(Node node){

        if (node.next == null){
            head = node;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public static void main(String[] args) {
        System.out.println("Merge 2 list");
        LinkedList list1 = new LinkedList();
        list1.insertEnd(1);
        list1.insertEnd(2);
        list1.insertEnd(3);

        LinkedList list2 = new LinkedList();
        list2.insertEnd(1);
        list2.insertEnd(3);
        list2.insertEnd(4);
        list2.insertEnd(5);

        LinkedList ans = LinkedList.merge(list1,list2);
        ans.display();
    }



}
