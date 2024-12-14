package LinkedList.Theory;

public class SingleLinkedListMain {
    public static void main(String[] args) {

        CustomSingleLinkedList ll= new CustomSingleLinkedList();
        ll.insertFirst(23);
        ll.insertFirst(3);

        ll.insertFirst(78);

        ll.insertFirst(34);
        ll.insertLast(1);

        ll.insertAtIndex(44,3);
        ll.display();
        ll.deleteFirst();

        ll.display();
        ll.deleteLast();
        ll.display();
        ll.deleteAtIndex(1);
        ll.display();

    }
}
