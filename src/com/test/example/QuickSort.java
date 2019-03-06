package com.test.example;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/4.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{7, 0, 3, 2, 1, 10, 5, 6};
        QuickSort q = new QuickSort();
        q.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private void quickSort(int[] array, int left, int right) {
        if (left > right) return;
        int i = left;
        int j = right;
        int temp = array[left];
        while (i < j) {
            while (i < j && array[j] >= temp)
                j--;
            while (i < j && array[i] <= temp)
                i++;
            if (i < j) {
                int tempVal = array[i];
                array[i] = array[j];
                array[j] = tempVal;
            }
        }
        array[left] = array[i];
        array[i] = temp;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
}
