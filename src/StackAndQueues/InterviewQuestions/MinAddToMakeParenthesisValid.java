package StackAndQueues.InterviewQuestions;

import java.util.Stack;

public class MinAddToMakeParenthesisValid {
    public static void main(String[] args) {

        System.out.println(isValid("))"));
    }
    public static int isValid(String str){

        Stack<Character> stack= new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){  // if ch is ) but the stack isn't empty while the previous character was ( then pop
                    stack.pop();
                }
                else
                    stack.push(ch);                 // if ch is = ) but the stack is empty, then also push
            }
            else
                stack.push(ch);            // if ch is = ( then push it to the stack
        }
        return stack.size();
    }
}
