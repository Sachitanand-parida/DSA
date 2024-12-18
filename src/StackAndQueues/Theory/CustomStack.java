package StackAndQueues.Theory;

public class CustomStack {
    protected int[] arr;
    private static final int DEFAULT_SIZE= 10;

    int ptr= -1;
    CustomStack(){
        this(DEFAULT_SIZE);
    }
    CustomStack(int size){
        this.arr = new int[size];
    }

    public boolean push(int item){

        if(isFull())
            return false;

        ptr++;
        arr[ptr]= item;
        return true;
    }

    public void display(){
        if (isEmpty())
            System.out.println("Stack is empty");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public int pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty. Cannot pop");

        int removed= arr[ptr];
        ptr--;
        return removed;
    }
    public  int peek() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty. Cannot peek");
        return arr[ptr];
    }
    public boolean isFull() {
        return (ptr == arr.length-1);           //ptr is at the last index
    }
    public boolean isEmpty() {
        return (ptr == -1);                     //ptr is before the first index
    }
}
