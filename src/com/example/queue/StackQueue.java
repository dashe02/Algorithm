package com.example.queue;

import java.util.Stack;

/**
 * Created by wecash on 19/2/16.
 * 两个栈实现一个队列
 */
public class StackQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(Integer val) {
        stack1.push(val);
    }

    public Integer pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        System.out.println(stackQueue.pop());
    }
}
