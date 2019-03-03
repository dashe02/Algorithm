package com.example.queue;

import java.util.Comparator;

/**
 * Created by wecash on 19/2/28.
 */
public class MinQueue<T> {

    private Object[] queue;

    private int size;

    public MinQueue() {
        queue = new Object[11];
    }

    public boolean offer(T t) {
        int k = size;
        if (k == 0) {
            queue[0] = t;
        }
        size++;
        moveUp(k, t);
        return true;
    }

    public T poll() {
        if (size == 0)
            return null;
        int s = --size;
        T result = (T) queue[0];
        T end = (T) queue[s];
        queue[s] = null;
        if (s != 0)
            moveDown(0, end);
        return result;
    }

    private void moveUp(int k, T t) {
        Comparable<? super T> key = (Comparable<? super T>) t;
        while (k > 0) {
            int parent = (k - 1) >> 1;
            Object e = queue[parent];
            if (key.compareTo((T) e) > 0)
                break;
            queue[k] = e;
            k = parent;
        }
        queue[k] = key;
    }

    private void moveDown(int k, T end) {
        Comparable<? super T> key = (Comparable<? super T>) end;
        int half = size >>> 1;
        while (k < half) {
            int left = (k << 1) + 1;
            int right = left + 1;
            Object c = queue[left];
            if (right < size && ((Comparable<? super T>) c).compareTo((T) queue[right]) > 0) {
                c = queue[left = right];
            }
            if (key.compareTo((T) c) <= 0)
                break;
            queue[k] = c;
            k = left;
        }
        queue[k] = key;
    }

    public static void main(String[] args) {
        MinQueue<Integer> queue = new MinQueue<>();
        queue.offer(4);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(6);
        queue.offer(7);
        for (int i = 0; i < queue.size; i++) {
            System.out.print(queue.poll());
        }
    }
}
