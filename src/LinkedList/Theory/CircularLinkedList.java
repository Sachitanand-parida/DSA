package LinkedList.Theory;

public class CircularLinkedList {

    private Node head;

    public void insertLast(int value){
        Node node= new Node(value);
        Node temp= head;

        if(head==null){
            head= node;
            node.next= head;
            return;
        }

        while (temp.next!= head){
            temp= temp.next;
        }

        temp.next=node;
        node.next=head;

    }
    public void display(){
        Node temp= head;
        do{
            System.out.print(temp.value+"-> ");
            temp= temp.next;
        }while (temp!= head);
        System.out.println("END");
    }

    public void delete(int value){

        Node temp= head;
        Node node= null;
        do{
            if(temp.value ==value)
                node=temp;
            temp= temp.next;
        }while (temp!=head);

    }
    private class Node{
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
