package StackTest;

import java.util.Stack;

public class minStack {
    Stack<Integer> stack1, stack2;

    public minStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x){
        stack1.push(x);
        if (stack2.isEmpty() || stack2.peek()>=x){
            stack2.push(x);
        }
    }

    public void pop(){
        if (stack1.pop().equals( stack2.peek()));
            stack2.pop();
    }

    public int top(){
        return stack1.peek();
    }

    public int min(){
        return stack2.peek();
    }


}
