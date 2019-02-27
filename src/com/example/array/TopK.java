package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/2/26.
 */
public class TopK {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5, 8, 9, 10};
        int[] arr2 = new int[]{2, 4, 6, 8, 9, 11};
        int k = 5;
        TopK topK = new TopK();
        int[] temp = topK.findTopK(arr1, arr2, k);
        System.out.println(Arrays.toString(temp));
    }

    private int[] findTopK(int[] arr1, int[] arr2, int k) {
        int i = 0;
        int j = 0;
        int k1 = 0;
        int[] temp = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k1++] = arr1[i++];
            } else {
                temp[k1++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            temp[k1++] = arr1[i++];
        }
        while (j < arr2.length) {
            temp[k1++] = arr2[j++];
        }
        int[] result = new int[k];
        int n = 0;
        for (int x = temp.length - 1; x >= 0; x--) {
            if (n == k) {
                break;
            }
            int value = temp[x];
            if (isNotExist(value, result)) {
                result[n++] = value;
            }
        }
        return result;
    }

    private boolean isNotExist(int value, int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == value) {
                return false;
            }
        }
        return true;
    }
}
