package com.exercise.stack;

import java.util.Stack;

/**
 * Created by wecash on 19/3/13.
 */
public class StackOrder {

    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        StackOrder s = new StackOrder();
        System.out.print(s.stackOrder(pushA, popA));
    }

    private boolean stackOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || pushA.length != popA.length) {
            return false;
        }
        boolean flag = false;
        int n = pushA.length;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        for (int val : popA) {
            while (stack.isEmpty() || stack.peek() != val) {
                if (i >= n) {
                    flag = true;
                    break;
                }
                stack.push(pushA[i++]);
            }
            if (flag) {
                break;
            }
            stack.pop();
        }
        return stack.isEmpty();
    }
}
