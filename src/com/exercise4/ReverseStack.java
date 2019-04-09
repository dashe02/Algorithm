package com.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wecash on 19/4/5.
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        /*while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }*/
        ReverseStack r = new ReverseStack();
        r.reverseStack1(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    private void reverseStack(Stack<Integer> stack) {
        int n = stack.size();
        help(stack, n);
    }

    private void help(Stack<Integer> stack, int n) {
        if (n == 0) {
            return;
        }
        Integer top = stack.pop();
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        stack.push(top);
        for (Integer i : list) {
            stack.push(i);
        }
        help(stack, n - 1);
    }

    private void reverseStack1(Stack<Integer> stack) {
        int tmp;
        if (stack.size() <= 1) {
            return;
        } else {
            tmp = stack.pop();
            reverseStack1(stack);
            pushToBottom(stack, tmp);
        }
    }

    private void pushToBottom(Stack<Integer> stack, int value) {
        int tmp;
        if (stack.size() == 0) {
            stack.push(value);
        } else {
            tmp = stack.pop();
            pushToBottom(stack, value);
            stack.push(tmp);
        }
    }
}
