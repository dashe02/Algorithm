package com.test;

import java.util.Arrays;

/**
 * Created by wecash on 19/2/20.
 */
public class HeapSort1 {

    public void heapSort(int[] array) {

        //构建大顶堆
        for (int i = array.length / 2; i >= 0; i--) {
            adjustHeap(array, 0, array.length);
        }
        //堆排序
        for (int j = array.length - 1; j >= 0; j--) {
            //将对顶的元素和j元素交换
            swap(array, 0, j);
            //不断调整堆
            adjustHeap(array, 0, j);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void adjustHeap(int[] array, int parent, int length) {
        //将父节点的值赋给temp
        int temp = array[parent];
        //左子节点
        int child = parent * 2 + 1;
        while (child < length) {
            //如果存在右子节点，同时右子节点大于左子节点,就取右子节点
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            //如果父节点的值大于子节点的值，则直接跳出
            if (array[child] <= temp) {
                break;
            }
            //否则将父节点值和子节点值交换
            array[parent] = array[child];
            parent = child;
            child = child * 2 + 1;
        }
        array[parent] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 7, 0, 4, 5, 8};
        HeapSort1 h = new HeapSort1();
        h.heapSort(a);
        System.out.println(Arrays.toString(a));
    }
}
