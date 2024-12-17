package LinkedList.InterviewQuestions;

public class SortLinkedListUsingMergeSort {

    public CustomLinkedList.Node sortList(CustomLinkedList.Node head){

        if(head== null || head.next== null)
            return head;

        CustomLinkedList.Node mid= getMiddle(head);
        CustomLinkedList.Node left= sortList(head);
        CustomLinkedList.Node right= sortList(head);

        return mergeSort(left, right);
    }

    public static CustomLinkedList.Node getMiddle(CustomLinkedList.Node head){
        CustomLinkedList.Node midPrev= null;
        while (head!=null && head.next!=null){
            midPrev= (midPrev==null)? head: midPrev.next;
            head= head.next.next;
        }
        CustomLinkedList.Node mid= midPrev.next;
        mid.next= null;                             //splits the list into two, the first half is discarded
        return mid;                                 //returns the second half
    }

    public static CustomLinkedList.Node mergeSort(CustomLinkedList.Node list1, CustomLinkedList.Node list2){
        CustomLinkedList.Node dummyHead= new CustomLinkedList.Node();
        CustomLinkedList.Node tail= dummyHead;

        while (list1 !=null && list2!= null){
                if(list1.value < list2.value){
                    tail.next= list1;
                    list1= list1.next;
                    tail= tail.next;
                }
                else {
                    tail.next= list2;
                    list2= list2.next;
                    tail= tail.next;
                }
        }
        tail.next= (list1!=null)? list1: list2;
        return dummyHead.next;
    }
}

