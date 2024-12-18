package LinkedList.InterviewQuestions;

public class RotateLinkedList {

    /*
        1 -> 2 -> 3-> 4-> 5-> 6         if k=2
        5-> 6-> 1-> 2-> 3-> 4
     */
    public CustomLinkedList.Node rotateRight(CustomLinkedList.Node head, int k){
        if(head == null || head.next == null || k<0)
            return head;

        CustomLinkedList.Node lastNode= head;
        int length= 1;
        while (lastNode != null){
            lastNode= lastNode.next;
            length++;
        }
        lastNode.next= head;

        int rotation= k % length;

        int skip= length-rotation;

        CustomLinkedList.Node newLast= head;
        for (int i = 0; i < skip - 1; i++) {
            newLast= newLast.next;
        }
        head= newLast.next;
        newLast.next= null;

        return head;
    }
}
