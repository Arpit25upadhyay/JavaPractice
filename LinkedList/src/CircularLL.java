public class CircularLL {

    private Node head;
    private Node tail;
    private int size;

    public CircularLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node node){
            this.value = value;
            this.next = node;
        }
    }


    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }


        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + "->");
                temp = temp.next;
            }while (temp != head);
        }
    }

    public void delete(int val){
        Node temp = head;
        if(temp == null) return;
        if(temp.value == val){
            head = temp.next;
            tail.next = head;
            return;
        }

        do{
            Node n = temp.next;
            if(n.value == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);
    }
}
