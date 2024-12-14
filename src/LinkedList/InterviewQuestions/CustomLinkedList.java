package LinkedList.InterviewQuestions;

import java.util.ArrayList;

public class CustomLinkedList {
    private Node head;

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
