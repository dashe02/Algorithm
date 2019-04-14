package com.exercise4;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by wecash on 19/4/6.
 */
public class FindMedium {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    int count = 0;

    public void insert(int num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int temp = maxHeap.poll();
            minHeap.offer(temp);
        } else {
            minHeap.offer(num);
            int temp = minHeap.poll();
            maxHeap.offer(temp);

        }
        count++;
    }

    public double getMedium() {
        if (count % 2 == 0) {
            return (maxHeap.poll() + minHeap.poll()) / 2.0;
        } else {
            return minHeap.poll();
        }
    }
}
