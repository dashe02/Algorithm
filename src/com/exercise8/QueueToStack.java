package com.exercise8;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by wecash on 19/4/16.
 */
public class QueueToStack {

    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    int size = 0;

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        size++;
    }

    public int pop() {
        int pollVal = q1.poll();
        size--;
        return pollVal;
    }

    public int peek() {
        return q1.peek();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
