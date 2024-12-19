package StackAndQueues.Theory;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue= new CustomQueue(5);
        queue.insert(23);
        queue.insert(56);
        queue.insert(7);
        queue.insert(86);
        queue.insert(345);
        //queue.display();
        queue.remove();
        //queue.display();

        CircularQueue circularQueue= new CircularQueue(5);
        circularQueue.insert(23);
        circularQueue.insert(56);
        circularQueue.insert(7);
        circularQueue.insert(86);
        circularQueue.insert(345);
        circularQueue.display();
        circularQueue.remove();
        circularQueue.display();


    }
}
