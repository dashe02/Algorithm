package com.exercise.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/18.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {8, 0, 1, 1, 3, 4, 2, 7, 5};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(array);
        System.out.print(Arrays.toString(array));
    }

    private void bubbleSort(int[] array) {
        int i = 0;
        int temp = 0;
        for (i = 0; i < array.length - 1; i++) {
            int j = 0;
            int flag = 0;
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return;
            }
        }
    }

}
