package com.exercise.heap;

/**
 * Created by wecash on 19/3/17.
 */
public class MinHeap {

    int[] data;

    public MinHeap(int[] data) {
        this.data = data;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = data.length / 2 - 1; i >= 0; i--)
            heaify(i);
    }

    private void heaify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < data.length && data[l] < data[smallest])
            smallest = l;
        if (r < data.length && data[r] < data[smallest])
            smallest = r;
        if (i == smallest) {
            return;
        }
        swap(i, smallest);
        heaify(smallest);
    }

    private int right(int i) {
        return (i + 1) << 1;
    }

    private int left(int i) {
        return ((i + 1) << 1) - 1;
    }

    private void swap(int i, int smallest) {
        int temp = data[i];
        data[i] = data[smallest];
        data[smallest] = temp;
    }


}
