package StackAndQueues.InterviewQuestions;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> first;
    private Stack<Integer> second;

    QueueUsingStacks(){
        first= new Stack<>();
        second= new Stack<>();
    }
    public void add(int item){
        first.add(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removed= second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked= second.peek();

        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
}