package com.test.test.heap;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/12.
 */
public class TopNForHeap {

    public static void main(String[] args) {
        int[] array = {8, 0, 3, 1, 4, 5, 6, 9, 10};
        int k = 5;
        int[] result = new int[5];
        for (int i = 0; i < k; i++)
            result[i] = array[i];
        MinHeap heap = new MinHeap(result);
        for (int i = k; i < array.length; i++) {
            int max = heap.getRoot();
            if (array[i] > max) {
                heap.setRoot(array[i]);
            }
        }
        System.out.print(Arrays.toString(result));
    }
}
