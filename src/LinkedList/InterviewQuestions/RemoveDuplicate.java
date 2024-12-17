package LinkedList.InterviewQuestions;

public class RemoveDuplicate {
    public static void main(String[] args) {

        CustomLinkedList ll= new CustomLinkedList();
        ll.insertNodeValue(5);
        ll.insertNodeValue(3);
        ll.insertNodeValue(3);
        ll.insertNodeValue(3);
        ll.insertNodeValue(3);
        ll.insertNodeValue(3);
        ll.insertNodeValue(3);
        ll.insertNodeValue(2);
        ll.insertNodeValue(2);
        ll.insertNodeValue(2);
        ll.insertNodeValue(2);
        ll.insertNodeValue(2);
        ll.insertNodeValue(2);

        ll.display();
        ll.removeDuplicate();
        ll.display();
    }
}
