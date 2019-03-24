package com.exercise2;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/23.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = {5, 1, 2, 3, 7, 8, 10};
        HeapSort h = new HeapSort();
        h.heapSort(array);
        System.out.print(Arrays.toString(array));
    }

    private void heapSort(int[] array) {
        //建堆
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(i, array.length, array);
        //排序
        for (int i = array.length - 1; i >= 0; i--) {
            swap(0, i, array);
            heapify(0, i, array);
        }
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void heapify(int parent, int length, int[] array) {
        int child = parent * 2 + 1;
        int temp = array[parent];
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1])
                child++;
            if (array[child] <= temp) return;
            array[parent] = array[child];
            parent = child;
            child = child * 2 + 1;
        }
        array[parent] = temp;
    }
}
