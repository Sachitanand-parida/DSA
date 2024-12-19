package StackAndQueues.InterviewQuestions;

import java.util.Stack;

public class QueueUsingStacksRemoveEfficient {

    private Stack<Integer> first;
    private Stack<Integer> second;

    QueueUsingStacksRemoveEfficient(){
        first= new Stack<>();
        second= new Stack<>();
    }
    public void add(int item){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.add(item);
        while (!second.isEmpty())
            first.push(second.pop());
    }

    public int remove(){
        return first.pop();
    }
}
