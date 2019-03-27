package com.exercise3;

/**
 * Created by wecash on 19/3/26.
 */
public class LianxuMax {

    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4};
        LianxuMax l = new LianxuMax();
        int max = l.lianxuMax(array);
        System.out.print(max);
    }

    private int lianxuMax(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int sum = max;
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (max <= sum) {
                    max = sum;
                }
            }
            if (result == 0) {
                result = max;
            } else {
                if (result < max) {
                    result = max;
                }
            }
        }
        return result;
    }
}
