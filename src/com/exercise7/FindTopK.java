package com.exercise7;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/13.
 */
public class FindTopK {

    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 8, 10};
        int[] num2 = {2, 4, 7, 9, 11};
        int k = 3;
        int[] result = findTopK(num1, num2, k);
        System.out.print(Arrays.toString(result));
    }


    private static int[] findTopK(int[] num1, int[] num2, int k) {
        int i = num1.length - 1;
        int j = num2.length - 1;
        int k1 = 0;
        int[] result = new int[k];
        while (i >= 0 && j >= 0 && k1 < k) {
            if (num1[i] > num2[j]) {
                result[k1++] = num1[i];
                i--;
            } else if (num1[i] < num2[j]) {
                result[k1++] = num2[j];
                j--;
            }
        }
        return result;
    }
}
