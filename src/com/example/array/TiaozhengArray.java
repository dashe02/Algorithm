package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/7.
 */
public class TiaozhengArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 6, 7, 9, 10};
        TiaozhengArray t = new TiaozhengArray();
        System.out.print(Arrays.toString(t.tiaozhengArray(array)));
    }

    private int[] tiaozhengArray(int[] array) {
        int[] qishu = new int[array.length];
        int[] oushu = new int[array.length];
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                qishu[k1++] = array[i];
            } else {
                oushu[k2++] = array[i];
            }
        }
        int k = 0;
        for (int i = 0; i < qishu.length; i++) {
            array[k++] = qishu[i];
        }
        for (int i = 0; i < oushu.length; i++) {
            array[k++] = oushu[i];
        }
        return array;
    }
}
