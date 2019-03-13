package com.example.sort;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/10.
 */
public class TopKOfHeap {

    public static void main(String[] args) {
        int[] array = {5, 1, 2, 0, 9, 5, 7, 4};
        int k = 3;
        TopKOfHeap t = new TopKOfHeap();
        int[] result = t.topK(array, k);
        System.out.print(Arrays.toString(result));
    }

    private int[] topK(int[] array, int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        MinHeap minHeap = new MinHeap(result);
        for (int j = k; j < array.length; j++) {
            if (array[j] > minHeap.getRoot()) {
                minHeap.setRoot(array[j]);
            }
        }
        return result;
    }


}
