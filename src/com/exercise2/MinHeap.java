package com.exercise2;

/**
 * Created by wecash on 19/3/23.
 */
public class MinHeap {

    int[] data;

    public MinHeap(int[] data) {
        this.data = data;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = data.length / 2 - 1; i >= 0; i--)
            heapify(i);
    }

    private void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < data.length && data[l] < data[smallest])
            smallest = l;
        if (r < data.length && data[r] < data[smallest])
            smallest = r;
        if (i == smallest) return;
        swap(i, smallest);
        heapify(smallest);
    }

    private int left(int i) {
        return ((i + 1) << 1) - 1;
    }

    private int right(int i) {
        return ((i + 1) << 1);
    }

    private void swap(int i, int smallest) {
        int temp = data[i];
        data[i] = data[smallest];
        data[smallest] = temp;
    }

    public int getRoot() {
        return data[0];
    }

    public void setRoot(int i) {
        data[0] = i;
        heapify(0);
    }


}
