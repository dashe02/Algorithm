package com.exercise.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/17.
 */
public class MaxValue {

    public int getMax(int[] a) {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int min1 = 0;
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {-1, -4, -3, 2};
        //－4,-3,-1,2
        MaxValue maxValue = new MaxValue();
        Arrays.sort(A);
        System.out.print(maxValue.getMax(A));

        int[] array = {1, 2, 3, 4, 5, 6};
    }
}
