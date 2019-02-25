package com.test.test;

import com.test.QuickSort;

/**
 * Created by wecash on 19/2/25.
 */
public class QuickSort2 {

    public static void main(String[] args) {
        int[] array = new int[]{5, 0, 1, 3, 7, 2, 8};
        QuickSort2 q = new QuickSort2();
        q.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int key = array[left];
        while (i < j) {
            while (i < j && array[j] >= key)
                j--;
            while (i < j && array[i] <= key)
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
}
