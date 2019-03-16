package com.exercise.array;

/**
 * Created by wecash on 19/3/15.
 */
public class LianxuMaxSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LianxuMaxSum l = new LianxuMaxSum();
        System.out.print(l.lianxuMaxSum(array));
    }

    private int lianxuMaxSum(int[] array) {
        int max = 0;
        int add = 0;
        for (int i = 0; i < array.length; i++) {
            add += array[i];
            if (add < 0) {
                add = 0;
            }
            if (add > max) {
                max = add;
            }
        }
        return max;
    }
}
