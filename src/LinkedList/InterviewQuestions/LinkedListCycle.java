package LinkedList.InterviewQuestions;

public class LinkedListCycle {
    public static void main(String[] args) {

    }
    public Boolean hasCycle(CustomLinkedList.Node head){
        CustomLinkedList.Node fast= head;
        CustomLinkedList.Node slow= head;

        while (fast!=null && fast.next != null){ // ensure fast has not reached the end of the list and fast.next ensures the upcoming node has a valid next
            fast= fast.next.next;
            slow= slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

    public int cycleLength(CustomLinkedList.Node head){
        CustomLinkedList.Node fast= head;
        CustomLinkedList.Node slow= head;

        while (fast!=null && fast.next != null){
            fast= fast.next.next;
            slow= slow.next;
            if(fast==slow){
                CustomLinkedList.Node temp= slow;  // logic is that a cycle will return to its origin, meanwhile we just count the length of cycle.
                int length= 0;
                do{
                    temp= temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }
}
