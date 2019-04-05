package com.test;

import java.util.PriorityQueue;

/**
 * Created by wecash on 19/4/3.
 */
public class FindMediumNum {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    int count = 0;

    public void insert(int num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int temp = maxHeap.poll();
            minHeap.offer(temp);
        } else if (count % 2 == 1) {
            minHeap.offer(num);
            int temp = minHeap.poll();
            maxHeap.offer(temp);
        }
    }

    public double getMedium() {
        if (count % 2 == 0) {
            return (minHeap.poll() + maxHeap.poll()) / 2.0;
        } else {
            return minHeap.poll();
        }
    }
}
