package StackTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class validateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 5, 3, 2, 1};
        System.out.println(validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int curIndex = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek().equals(popped[curIndex]) && curIndex < popped.length) {
                curIndex++;
                stack.pop();
            }
        }
        return curIndex == popped.length;
    }
}
