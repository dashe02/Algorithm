package com.example.sort;

/**
 * Created by wecash on 19/2/17.
 */
public class QuickSort {


    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int key = arr[start]; //初始化保存基元
            int i = start, j;
            for (j = start + 1; j <= end; j++) {
                if (arr[j] < key) {
                    int temp = arr[j];
                    arr[j] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++;
                }
            }
            arr[start] = arr[i];
            arr[i] = key;
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,213,134,44,77,78,23,43};
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
