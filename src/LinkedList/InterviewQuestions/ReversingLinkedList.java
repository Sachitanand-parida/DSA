package LinkedList.InterviewQuestions;

public class ReversingLinkedList {

//    private void recursiveReverse( CustomLinkedList.Node node){
//        if (node== tail){
//            head= tail;
//            return;
//        }
//        recursiveReverse(node.next);
//        tail.next= node;
//        tail= node;
//        tail.next = null;
//    }
    public CustomLinkedList.Node reverseIteratively(CustomLinkedList.Node head){
        if(head == null)
            return head;

        CustomLinkedList.Node prev= null;
        CustomLinkedList.Node present= head;
        CustomLinkedList.Node next= present.next;

        while (present!= null){
            present.next= prev;
            prev= present;
            present= next;
            if(next!= null)
                next= next.next;
        }
        return prev;
    }
}
