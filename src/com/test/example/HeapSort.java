package com.test.example;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/4.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 7, 3, 9, 0, 6};
        HeapSort h = new HeapSort();
        h.heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private void heapSort(int[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
        for (int j = array.length - 1; j >= 0; j--) {
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void adjustHeap(int[] array, int parent, int length) {
        int temp = array[parent];
        int child = parent * 2 + 1;
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1])
                child++;
            if (array[child] <= temp)
                break;
            array[parent] = array[child];
            parent = child;
            child = child * 2 + 1;
        }
        array[parent] = temp;
    }
}
