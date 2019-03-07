package com.test.test.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wecash on 19/3/7.
 */
public class GetMaxValue {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 5, 7, 9, 10, 3, 2, 0};
        GetMaxValue g = new GetMaxValue();
        //System.out.print(g.findMaxValue(array));
        System.out.print(g.getMax(array));
    }

    private int findMaxValue(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i];
            }
        }
        return 0;
    }

    public int getMax(int[] array) {
        int[] temp = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            temp[i] = array[i] - array[i + 1];
        }
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }
}
