package LinkedList.Theory;

public class CustomDoublyLinkedList {

    private Node head;                  // default value is null

    public void insertFirst(int value){
        Node node= new Node(value);
        if(head == null){
            node.next= null;
            node.prev= null;
            head= node;
            return;
        }
        node.next= head;
        //if(head !=null)       if we are not checking null before hand then use this condition
            head.prev= node;
        node.prev= null;
        head= node;
    }
    public void display(){
        Node temp= head;

        while (temp != null){
            System.out.print(temp.value+ "-> ");
            temp= temp.next;
        }
        System.out.println("END");
    }

    public void reverseDisplay(){
        Node temp= head;
        Node last= null;
        while (temp!= null) {
            last= temp;                         // this is actually the last element
            temp = temp.next;                   // this is equal to null at the end of the loop
        }

        while (last != null){
            System.out.print(last.value+" ->");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int value){
        Node node= new Node(value);
        Node last= null;
        Node temp= head;

        while (temp!= null){
            last= temp;                 //best way to pull out the last element**
            temp= temp.next;
        }
        node.next= null;                //first ensure all the node arrows are mapped correctly
        node.prev= last;
        last.next=node;                 //finally map the last element to the new node
    }

    public void insertNodeAtIndex(int index, int value){
        Node node= new Node(value);
        Node last= null;
        Node temp= head;

        for (int i = 0; i < index; i++) {
            last= temp;
            temp= temp.next;
        }
        if(last!=null) {
            node.next = last.next;
            node.prev = last.next.prev;
            last.next = node;
        }

    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
