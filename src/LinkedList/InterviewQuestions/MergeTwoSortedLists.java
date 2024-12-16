package LinkedList.InterviewQuestions;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        CustomLinkedList first= new CustomLinkedList();
        first.insertFirst(5);
        first.insertFirst(3);
        first.insertFirst(1);
        first.display();

        CustomLinkedList second= new CustomLinkedList();
        second.insertFirst(6);
        second.insertFirst(4);
        second.insertFirst(2);
        second.display();

        CustomLinkedList customLinkedList = mergeTwoLinkedList(first, second);
        customLinkedList.display();

    }
    public static CustomLinkedList mergeTwoLinkedList( CustomLinkedList first, CustomLinkedList second){
        CustomLinkedList.Node f= first.head;
        CustomLinkedList.Node s= second.head;

        CustomLinkedList ans= new CustomLinkedList();

        /*
        Suppose there are 7 elements in first and 5 elements in second list
         */

        while (f!= null && s!=null) {            //this will check for the first 5 values
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
            while (f!= null){                   // this will check for the last 2 extra values of first list
                ans.insertLast(f.value);
                f= f.next;
            }
            while (s!= null){
                ans.insertLast(s.value);
                s= s.next;
            }
        return ans;
    }
}
