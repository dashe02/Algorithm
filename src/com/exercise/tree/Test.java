package com.exercise.tree;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/12.
 */
public class Test {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] qishuArray = new int[array.length];
        int[] oushuArray = new int[array.length];
        int qishu = 0;
        int oushu = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                qishuArray[qishu++] = array[i];
            } else if (array[i] % 2 == 0) {
                oushuArray[oushu++] = array[i];
            }
        }
        for (int i = 0; i < qishu; i++) {
            array[i] = qishuArray[i];
        }
        for (int j = 0; j < oushu; j++) {
            array[j + qishu] = oushuArray[j];
        }
        System.out.print(Arrays.toString(array));
    }
}
