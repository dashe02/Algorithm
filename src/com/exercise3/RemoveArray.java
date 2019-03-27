package com.exercise3;

/**
 * Created by wecash on 19/3/25.
 */
public class RemoveArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveArray r = new RemoveArray();
        int len = r.removeArray(array);
        System.out.print(len);
    }

    private int removeArray(int[] array) {
        if (array == null) return 0;
        if (array.length < 3) return array.length;
        int i = 1;
        for (int j = i + 1; j < array.length; ++j) {
            if (array[j] != array[i] || array[j] == array[i] && array[i - 1] != array[j]) {
                array[i + 1] = array[j];
                ++i;
            }
        }
        return i + 1;
    }
}
