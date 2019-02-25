package com.test.test;

/**
 * Created by wecash on 19/2/25.
 */
public class HeapSort3 {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 0, 6, 4, 3};
        HeapSort3 h = new HeapSort3();
        h.heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
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
        int child = parent * 2 + 1;
        int temp = array[parent];
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] <= temp)
                break;
            array[parent] = array[child];
            parent = child;
            child = child * 2 + 1;
        }
        array[parent] = temp;
    }
}
