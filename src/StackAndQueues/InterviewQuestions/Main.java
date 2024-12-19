package StackAndQueues.InterviewQuestions;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queueUsingStacks= new QueueUsingStacks();
        queueUsingStacks.add(12);
        queueUsingStacks.add(45);
        queueUsingStacks.add(6);
        queueUsingStacks.add(75);

        System.out.println(queueUsingStacks.peek());

    }
}
