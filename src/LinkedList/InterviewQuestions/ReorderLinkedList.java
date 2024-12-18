package LinkedList.InterviewQuestions;

public class ReorderLinkedList {
    // 1 -> 2 -> 3 -> 4 -> 5
    // 1 -> 5 -> 2 -> 4 -> 3
    //Logic: find the middle of the list -> reverse the second half -> merge the two as per the condition
    public void reorderList(CustomLinkedList.Node head){
        if(head == null || head.next == null)
            return;

        CustomLinkedList.Node middle= middleNode(head);
        CustomLinkedList.Node headFirst= head;
        CustomLinkedList.Node headSecond= reverseIteratively(middle);

        //rearrange the two parts

        while (headFirst!=null && headSecond!=null){
            CustomLinkedList.Node temp= headFirst.next;
            headFirst.next= headSecond;
            headFirst= temp;

            //for the second half
            temp= headSecond.next;
            headSecond.next= headFirst;
            headSecond= temp;

            //setting next of tail to null
            if(headFirst!=null)
                headFirst.next= null;
        }


    }

    public  CustomLinkedList.Node middleNode(CustomLinkedList.Node head){
        CustomLinkedList.Node slow= head;
        CustomLinkedList.Node fast= head;
        while (fast!=null && fast.next!=null){      //while fast has not reached the end
            slow= slow.next;                        //while slow reaches the middle element, fast reaches the end
            fast= fast.next.next;
        }
        return slow;                                //return slow, which is exactly at the middle
    }
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
