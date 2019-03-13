package com.example.stack;

import com.example.queue.MyQueue;

/**
 * Created by wecash on 19/3/9.
 */
public class MyStack {

    private MyQueue queue1 = new MyQueue();

    private MyQueue queue2 = new MyQueue();

    private int size;

    public void push(Integer value) {
        queue1.add(value);
        size++;
    }

    public Integer pop() {
        Integer result = null;
        while (!queue1.isEmpty()) {
            if (queue1.size() == 1) {
                result = queue1.pop();
                while (!queue2.isEmpty()) {
                    queue1.add(queue2.pop());
                }
                break;
            } else {
                queue2.add(queue1.pop());
            }

        }
        size--;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
