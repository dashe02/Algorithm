package com.exercise3;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/27.
 */
public class SortArray {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 5, 4, 2, 10};
        SortArray s = new SortArray();
        int[] result = s.sortArray(nums);
        System.out.print(Arrays.toString(result));
    }

    //1 3 4 10
    //7 5 2
    private int[] sortArray(int[] nums) {
        int size = 0;
        if (nums.length % 2 == 0) {
            size = nums[nums.length - 2];
        } else if (nums.length % 2 == 1) {
            size = nums[nums.length - 1];
        }
        int[] temp = new int[size + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = nums[i];
        }
        int k = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                result[k++] = temp[i];
            }
        }
        return result;
    }
}
