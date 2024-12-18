package StackAndQueues.Theory;

import java.util.*;

public class InBuildExamples {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(12);
        stack.push(56);
        stack.push(23);
        stack.push(76);
        stack.push(15);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);

        Deque<Integer> deque= new ArrayDeque<>();
        deque.add(23);
        deque.addLast(45);
        deque.add(56);
        System.out.println(deque);

    }
}
