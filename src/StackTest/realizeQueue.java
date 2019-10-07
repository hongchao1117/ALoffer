package StackTest;

import java.util.Stack;

public class realizeQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();



    public void push(int node) {
         stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int node = stack2.pop();

        return node;
    }
}
