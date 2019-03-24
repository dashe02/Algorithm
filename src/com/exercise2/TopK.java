package com.exercise2;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/23.
 */
public class TopK {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 9, 3, 5, 8, 10};
        TopK t = new TopK();
        int k = 5;
        t.topK(array, k);
    }

    private void topK(int[] array, int k) {

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        MinHeap minHeap = new MinHeap(result);
        for (int i = k; i < array.length; i++) {
            int root = minHeap.getRoot();
            if (array[i] > root) {
                minHeap.setRoot(array[i]);
            }
        }
        System.out.print(Arrays.toString(result));
    }
}
