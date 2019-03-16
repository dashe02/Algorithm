package com.exercise.array;

import java.util.Stack;

/**
 * Created by wecash on 19/3/14.
 */
public class FindAllSumOfArray {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int sum = 10;
        FindAllSumOfArray f = new FindAllSumOfArray();
        f.findTwoSumOfArray(array, sum);
    }

    private void findTwoSumOfArray(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + "==" + array[j]);
                }
            }
        }
    }

    private void findAllSumOfArray(int[] array, int sum) {

    }


}
