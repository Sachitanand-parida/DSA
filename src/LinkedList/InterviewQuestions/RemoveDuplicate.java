package LinkedList.InterviewQuestions;

public class RemoveDuplicate {
    public static void main(String[] args) {

        CustomLinkedList ll= new CustomLinkedList();
        ll.insertNode(5);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(2);
        ll.insertNode(2);
        ll.insertNode(2);
        ll.insertNode(2);
        ll.insertNode(2);

        ll.display();
        ll.removeDuplicate();
        ll.display();
    }
}
