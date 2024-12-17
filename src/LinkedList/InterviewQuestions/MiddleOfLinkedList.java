package LinkedList.InterviewQuestions;

public class MiddleOfLinkedList {
    public static void main(String[] args) {

        CustomLinkedList linkedList= new CustomLinkedList();
        linkedList.insertLast(3);
        linkedList.insertLast(21);
        linkedList.insertLast(78);
        linkedList.insertLast(56);
        linkedList.insertLast(89);
        linkedList.insertLast(1);

        linkedList.display();

    }
    public static CustomLinkedList.Node middleNode(CustomLinkedList.Node head){
        CustomLinkedList.Node slow= head;
        CustomLinkedList.Node fast= head;
        while (fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next;
        }
        return slow;
    }

//    public static CustomLinkedList.Node middle(CustomLinkedList.Node head){
//        CustomLinkedList.Node temp= head;
//        int length= 0;
//
//        while (temp != null){
//            length++;
//            temp= temp.next;
//        }
//        temp= head;
//
//        for (int i = 0; i < length; i++) {
//            if(temp!= null) {
//                temp = temp.next;
//                if (i == length / 2)
//                    return temp;
//            }
//        }
//        return null;
//    }
}
