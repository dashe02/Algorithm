package com.example.sort;

/**
 * Created by wecash on 19/3/10.
 */
public class HeapTopK {

    public static void main(String[] args) {
        int[] array = {5, 1, 2, 0, 4, 8, 9, 7};
        int k = 3;
        HeapTopK h = new HeapTopK();
        //h.HeapSort(array);
        h.topK(array, k);
        //System.out.println(Arrays.toString(array));
    }

    private void topK(int[] array, int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        //建堆
        for (int i = result.length / 2; i >= 0; i--)
            adjustHeap(result, i, result.length - 1);
        for (int j = 0; j < array.length; j++) {
            if (result[0] > array[j]) {
                swap(result, 0, j);
                adjustHeap(result, 0, j);
            }
        }
    }

    private void heapSort(int[] array) {
        for (int i = array.length / 2; i >= 0; i--)
            adjustHeap(array, i, array.length - 1);
        for (int j = array.length - 1; j >= 0; j--) {
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }
    }


    private void adjustHeap(int[] array, int parent, int length) {
        int temp = array[parent];
        int child = parent * 2 + 1;
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1])
                child++;
            if (array[child] <= temp) {
                break;
            }
            array[parent] = array[child];
            parent = child;
            child = child * 2 + 1;
        }
        array[parent] = temp;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
