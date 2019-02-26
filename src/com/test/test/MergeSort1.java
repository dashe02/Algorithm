package com.test.test;

import java.util.Arrays;

/**
 * Created by wecash on 19/2/25.
 */
public class MergeSort1 {

    public static void main(String[] args) {
        int[] array = new int[]{8, 0, 2, 3, 1, 5, 4};
        MergeSort1 m = new MergeSort1();
        m.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private void mergeSort(int[] array, int left, int right) {
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
            array[left + k1] = temp[k1];
        }
    }

}
