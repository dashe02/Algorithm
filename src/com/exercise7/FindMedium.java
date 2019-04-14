package com.exercise7;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by wecash on 19/4/13.
 */
public class FindMedium {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    int count = 0;

    public void insetNum(int num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int temp = maxHeap.poll();
            minHeap.offer(temp);
        } else if (count % 2 == 1) {
            minHeap.offer(num);
            int temp = minHeap.poll();
            maxHeap.offer(temp);
        }
        count++;
    }

    public double getMedium() {
        if (count % 2 == 0) {
            return (minHeap.poll() + maxHeap.poll()) / 2.0;
        } else {
            return minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        int[] result = new int[num1.length + num2.length];
        int k = 0;
        FindMedium f = new FindMedium();
        for (int i = 0; i < num1.length; i++) {
            result[k++] = num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            result[k++] = num2[i];
        }
        for (int i = 0; i < result.length; i++) {
            f.insetNum(result[i]);
        }
        System.out.print(f.getMedium());
    }
}
