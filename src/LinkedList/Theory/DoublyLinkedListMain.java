package LinkedList.Theory;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        CustomDoublyLinkedList cdll= new CustomDoublyLinkedList();

        cdll.insertFirst(12);
        cdll.insertFirst(2);
        cdll.insertFirst(56);
        cdll.insertFirst(34);
        cdll.insertFirst(7);

        cdll.insertLast(98);
        cdll.insertNodeAtIndex(2,44);
        cdll.display();
        //cdll.reverseDisplay();

    }
}
