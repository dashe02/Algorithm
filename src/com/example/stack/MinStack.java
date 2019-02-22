package com.example.stack;

/**
 * Created by wecash on 19/2/22.
 */
public class MinStack {

    private int[] array = new int[10];

    private int[] minIndex = new int[10];

    private int size = 0;

    private int minSize = 0;

    public MinStack() {
    }

    public void push(int x) {
        if (size > array.length) {
            return;
        }
        array[size++] = x;
        minIndex[minSize++] = size;
    }

    public void pop() {
        size--;
        minSize--;
    }

    public int top() {
        return array[--size];
    }

    public int getMin() {
        int min = array[0];
        for (int i = 0; i < minSize; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(1);
        minStack.push(0);
        minStack.push(3);
        minStack.push(2);
        minStack.push(-1);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        /*minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());*/
    }
}
