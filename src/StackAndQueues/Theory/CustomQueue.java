package StackAndQueues.Theory;

public class CustomQueue {
    private int[] arr;
    private static final int DEFAULT_SIZE= 10;
    int end = 0;
    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.arr = new int[size];
    }
    public boolean insert(int item){
        if (isFull())
            return false;

        arr[end]= item;             //starts with -1 to end is valid
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        int removed= arr[0];

        //skip 1st element
        for (int i = 1; i < end; i++) {
            arr[i-1]= arr[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        return arr[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i]+ " <- ");
        }
        System.out.println("END");
    }


    private boolean isFull() {
        return (end == arr.length);           //ptr is at the last index
    }
    private boolean isEmpty() {
        return (end == 0);                     //ptr is before the first index
    }
}
