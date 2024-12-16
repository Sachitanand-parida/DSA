package LinkedList.InterviewQuestions;


public class CustomLinkedList {
    public Node head;

    public void insertNode(int value){
        Node node=new Node(value);

        if(head==null){
            head= node;
            node.next=null;
            return;
        }
        node.next= head;
        head= node;

    }
    public void insertLast(int value){

        Node temp= head;
        Node node= new Node(value);

        if(head == null){
            head= node;
            return;
        }
        while (temp.next!= null){
            temp= temp.next;
        }
        temp.next= node;

    }
    public void insertFirst(int value){

        Node node= new Node(value);

        if(head == null){
            head= node;
            return;
        }
       node.next= head;
        head= node;

    }
    public CustomLinkedList mergeTwoLinkedList( CustomLinkedList first, CustomLinkedList second){
        Node f= first.head;
        Node s= second.head;

        CustomLinkedList ans= new CustomLinkedList();

        while (f!= null && s!=null){
            if(f.value < s.value){
                ans.insertNode(f.value);
                f= f.next;
            }
            if(s.value < f.value){
                ans.insertNode(s.value);
                s= s.next;
            }
            while (f!= null){
                ans.insertNode(f.value);
                f= f.next;
            }
            while (s!= null){
                ans.insertNode(s.value);
                s= s.next;
            }
        }
        return ans;
    }
    public void removeDuplicate(){
        Node temp= head;

        while (temp.next!=null){
            if(temp.value == temp.next.value){
                temp.next=temp.next.next;
            }
            else
                temp= temp.next;
        }
    }
    public void display(){
        Node temp= head;
        while (temp != null){
            System.out.print(temp.value+ "-> ");
            temp= temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
