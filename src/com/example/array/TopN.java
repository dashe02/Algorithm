package com.example.array;

/**
 * Created by wecash on 19/3/6.
 */
public class TopN {

    public static void main(String[] args) {
        int[] array = {4, 1, 8, 0, 2, 3, 7, 9};
        int k = 5;
        TopN t = new TopN();
        t.topN(array, 0, array.length - 1, k);
        for (int i = 0; i < k; i++) {
            System.out.print(array[i]);
        }
    }

    private void topN(int[] array, int first, int end, int k) {
        if (first < end) {
            int partitionIndex = partition(array, first, end, k);
            if (partitionIndex == k - 1) return;
            else if (partitionIndex > k - 1) topN(array, first, partitionIndex - 1, k);
            else topN(array, partitionIndex + 1, end, k);
        }
    }


    private int partition(int[] array, int first, int end, int k) {
        if (first > end) return 0;
        int temp = array[first];
        int i = first;
        int j = end;
        while (i < j) {
            while (i < j && array[j] >= temp)
                j--;
            while (i < j && array[i] <= temp)
                i++;
            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[first] = array[i];
        array[i] = temp;
        return i;
    }
}
