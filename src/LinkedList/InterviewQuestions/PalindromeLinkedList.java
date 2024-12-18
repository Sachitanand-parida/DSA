package LinkedList.InterviewQuestions;

public class PalindromeLinkedList {

    /*
    Find the middle
    reverse the second half
    compare the first and second halves
     */
    public Boolean palindrome(CustomLinkedList.Node head){
        CustomLinkedList.Node middle= middleNode(head);
        CustomLinkedList.Node headSecond= reverseIteratively(middle);
        CustomLinkedList.Node reverseHead= headSecond;

        //compare both halves
        while (head!=null && headSecond!=null){
            if(head.value != headSecond.value)
                break;
        }
        head= head.next;
        headSecond= headSecond.next;

        reverseIteratively(reverseHead);

        return (head == null || headSecond == null);        //this means the loop has travelled the whole list. Therefore, palindrome
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
