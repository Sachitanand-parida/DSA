package LinkedList.Theory;

public class CustomSingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomSingleLinkedList(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node= new Node(value);
        node.next= head;                //head always points to the first node
        head= node;

        if(tail == null)
            tail = head;

        size+= 1;
    }

    public int deleteFirst(){
        int value= head.value;
        Node temp= head;
        temp= head.next;
        head= temp;
        //or we can also write head= head.next;
        if(head == null)
            tail= null;
        size--;
        return value;
    }

    public Node findNodeForValue(int value){

        Node temp= head;
        while (temp!=null){
            if(temp.value== value)
                return temp;
            temp= temp.next;
        }
        return null;
    }

    public void deleteLast(){
        Node node=getNodeAtIndex(size-2);       //head=0    and    tail=size
        tail= node;
        node.next=null;
    }
    public void deleteAtIndex(int index){
        Node prev= getNodeAtIndex(index-1);
        prev.next= prev.next.next;
    }
    public Node getNodeAtIndex(int index){
        Node node= head;
        for (int i = 0; i < index; i++) {
            node= node.next;
        }
        return node;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node= new Node(value);
        tail.next=node;
        tail= node;
        size+=1;
    }

    public void insertAtIndex(int value,int index){
        Node temp= head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node= new Node(value,temp.next);
        temp.next= node;

        size++;
    }

    public void display(){

        Node temp= head;
        while (temp != null) {
            System.out.print(temp.value+ "-> ");
            temp= temp.next;
        }
        System.out.println("END");

    }

    private class Node{
        private int value;
        private Node next;          //by default next value is null

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
