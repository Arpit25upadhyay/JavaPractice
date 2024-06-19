public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }


    private class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(Node prev, int val ,Node Next){
            this.prev  = prev;
            this.value = val;
            this.next = Next;
        }
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null) head.prev =newNode;
        head = newNode;
        if(tail == null) tail = head;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = null;
        newNode.prev = tail;
        //if(tail!=null)
        tail.next =newNode;
        tail = newNode;
        size++;
    }

    public void insertAfterVal(int val, int newVal){
        Node newNode = new Node(newVal);
        Node prevNode = getNode(val);
        if(prevNode == null){
            System.out.println("Node not found");
            return;
        }
        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        if(newNode.next != null) newNode.next.prev = newNode;
    }

    public Node getNode(int val){
        Node temp = head;
        while (temp != null){
            if (temp.value == val) { return temp; }
            temp = temp.next;
        }
        return null;
    }

}
