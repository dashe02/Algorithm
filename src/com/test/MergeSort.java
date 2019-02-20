package com.test;

import java.util.Arrays;

/**
 * Created by wecash on 19/2/20.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 6, 8, 2, 5, 4, 0};
        MergeSort m = new MergeSort();
        m.mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        mergeArray(array, left, mid, right);
    }

    private void mergeArray(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        for (int k1 = 0; k1 < temp.length; k1++) {
            array[k1 + left] = temp[k1];
        }
    }
}
