package com.test.example;

/**
 * Created by wecash on 19/3/4.
 */
public class TopN {

    int partion(int a[], int first, int end) {
        int i = first;
        int main = a[end];
        for (int j = first; j < end; j++) {
            if (a[j] < main) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }
        a[end] = a[i];
        a[i] = main;
        return i;
    }


    public void getTopKMinBySort(int a[], int first, int end, int k) {
        if (first < end) {
            int partionIndex = partion(a, first, end);
            if (partionIndex == k - 1) return;
            else if (partionIndex > k - 1) getTopKMinBySort(a, first, partionIndex - 1, k);
            else getTopKMinBySort(a, partionIndex + 1, end, k);
        }
    }

    private int partition1(int[] array, int left, int right) {
        if (left > right) return 0;
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
        return i;
    }

    public static void main(String[] args) {
        int a[] = {2, 20, 3, 7, 9, 1, 17, 18, 0, 4};
        int k = 6;
        TopN topN = new TopN();
        topN.getTopKMinBySort(a, 0, a.length - 1, k);
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
