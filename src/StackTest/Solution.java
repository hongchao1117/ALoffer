package StackTest;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    private int size;
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> minStack = new Stack<>();
    private int[] elements = new int[0];

    public void ensureCapacity(int size){
        int len = elements.length;
        if (size>len){
            int newLen = (len*2)/2+1;
            elements = Arrays.copyOf(elements,newLen);
        }
    }

    public void push(int node) {
       ensureCapacity(size+1);
       elements[size++] = node;
       if (node<=min){
           minStack.push(node);
           min = minStack.peek();
       }else{
           minStack.push(min);
       }

    }

    public void pop() {
        Integer top = top();
        if (top!=null){
            elements[size-1] = (Integer) null;
        }
        size--;
        minStack.pop();
        min = minStack.peek();
    }

    private boolean empty() {
        return size==0;
    }

    public int top() {
        if (!empty()){
            if (size-1>=0)
                return elements[size-1];
        }
        return (Integer) null;
    }

    public int min() {
        return min;
    }
}
