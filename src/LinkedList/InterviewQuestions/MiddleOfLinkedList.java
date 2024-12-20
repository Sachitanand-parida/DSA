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
        CustomLinkedList ans= new CustomLinkedList();
        ans.insertNode(middleNode(linkedList.head));
        ans.display();
    }
    public static CustomLinkedList.Node middleNode(CustomLinkedList.Node head){
        CustomLinkedList.Node slow= head;
        CustomLinkedList.Node fast= head;
        while (fast!=null && fast.next!=null){      //while fast has not reached the end
            slow= slow.next;                        //while slow reaches the middle element, fast reaches the end
            fast= fast.next.next;
        }
        return slow;                                //return slow, which is exactly at the middle
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
