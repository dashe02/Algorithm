package com.example.queue;

import java.util.Stack;

/**
 * Created by wecash on 19/3/9.
 */
public class MyQueue {

    private Stack<Integer> stack1 = new Stack<>();

    private Stack<Integer> stack2 = new Stack<>();

    private int size;

    public void add(Integer value) {
        stack1.push(value);
        size++;
    }

    public Integer pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        size--;
        return stack2.pop();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        while (!queue.isEmpty()) {
            System.out.print(queue.pop());
        }

    }
}
