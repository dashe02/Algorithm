package com.test.test;

/**
 * Created by wecash on 19/2/25.
 */
public class HeapSort4 {

    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 3, 6, 8, 0, 5};
        HeapSort4 h = new HeapSort4();
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
        int temp = array[parent];
        int child = parent * 2 + 1;
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
