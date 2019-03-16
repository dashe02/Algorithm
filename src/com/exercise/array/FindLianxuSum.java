package com.exercise.array;

/**
 * Created by wecash on 19/3/14.
 * 1    1    1
 * -2   -1   1
 * 3    3    3
 * 10   13  13
 * -4   9   13
 * 7    16  16
 * 2    18  18
 * -5   13  18
 */
public class FindLianxuSum {

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
        FindLianxuSum f = new FindLianxuSum();
        f.findLianxuSum(array);
    }

    private void findLianxuSum(int[] array) {
        int max = 0;
        int add = 0;
        for (int i = 0; i < array.length; i++) {
            add += array[i];
            if (add < 0) {
                add = 0;
            } else {
                if (add >= max) {
                    max = add;
                }
            }
        }
        System.out.println(max);
    }

   /* private void findLianxuSum1(int[] array) {
        int max = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = getMax(sum + array[i], array[i]);
            if (sum >= max) {
                max = sum;
            }
        }
        System.out.print(sum);
    }*/

    private int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
