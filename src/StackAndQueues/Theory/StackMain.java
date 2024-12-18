package StackAndQueues.Theory;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack= new CustomStack(4);
        stack.push(12);
        stack.push(34);
        stack.push(56);
        stack.push(67);
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
