package com.test;

/**
 * Created by wecash on 19/2/20.
 */
public class QuickSort {

    public void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int key = array[left];
        while (i < j) {
            while (i < j && array[j] > key)
                j--;
            while (i < j && array[i] < key)
                i++;
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = key;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    public static void main(String[] args) {
        int[] array = new int[]{11, 213, 134, 44, 77, 78, 23, 43};
        QuickSort q = new QuickSort();
        q.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
