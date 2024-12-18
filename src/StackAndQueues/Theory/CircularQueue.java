package StackAndQueues.Theory;

public class CircularQueue {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    CircularQueue() {
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size) {
        this.arr = new int[size];
    }
    public boolean insert(int item){
        if (isFull())
            return false;

        arr[end]= item;             //starts with -1 to end is valid
        end++;
        end= end % arr.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

       int removed= arr[front];
        front= front+1;
        front= front % arr.length;
        size--;

       return removed;
    }
    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        return arr[front];
    }

    public void display(){
        for (int i = front; i < end; i++) {
            System.out.print(arr[i]+ " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return (size == arr.length);           //end may not be the actual end in a circular queue
    }

    public boolean isEmpty() {
        return (size == 0);

    }
}
