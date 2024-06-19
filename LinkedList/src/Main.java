public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertFirst(25);
        l.display();

        System.out.println("Insert at end");
        l.insertEnd(19);
        l.display();

        System.out.println("Inset At idx 2");
        l.insertNode(8,2);
        l.display();

        System.out.println("delete head");
        l.deleteFirst();
        l.display();

        System.out.println("delete tail");
        l.deleteTail();
        l.display();

        System.out.println("delete at Idx");
        l.delete(2);
        l.display();

        System.out.println(l.findValue(8));


        System.out.println("Insert using recursion");
        l.insetRec(88,2);
        l.display();




        //------------------------Doubly Linked List---------------------------------
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(3);
        dll.insertFirst(19);
        dll.insertFirst(44);
        dll.insertFirst(2);
        dll.insertFirst(34);

        dll.display();
        //dll.displayReverse();

        dll.insertLast(45);
        dll.display();

        dll.insertAfterVal(33,68);
        dll.display();

         //------------------------Circular LL-------------------------------------------\
        CircularLL cll = new CircularLL();
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.insert(6);
        cll.insert(9);
        cll.insert(8);


        cll.display();

        cll.delete(5);
        System.out.println();
        cll.display();



    }



}