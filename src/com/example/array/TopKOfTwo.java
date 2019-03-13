package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/9.
 */
public class TopKOfTwo {

    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 6, 8, 9, 10, 12, 13};
        int[] a2 = {2, 6, 7, 9, 10, 11, 14};
        int k = 5;
        TopKOfTwo t = new TopKOfTwo();
        int[] result = t.topKOfTwo(a1, a2, k);
        System.out.println(Arrays.toString(result));
    }

    private int[] topKOfTwo(int[] a1, int[] a2, int k) {
        int[] result = new int[k];
        int i = 0, j = 0, k1 = 0;
        while (i < a1.length && j < a2.length) {
            if (k1 == k) {
                break;
            }
            if (a1[i] <= a2[j]) {
                result[k1++] = a1[i++];
            } else {
                result[k1++] = a2[j++];
            }
        }
        return result;
    }
}
