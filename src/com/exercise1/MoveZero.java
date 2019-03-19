package com.exercise1;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/18.
 */
public class MoveZero {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZero m = new MoveZero();
        m.moveZero(nums);
        System.out.print(Arrays.toString(nums));

    }

    private void moveZero(int[] nums) {
        int zeroCount = 0;
        int nozeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nozeroCount++;
            }
        }
        int[] zeroTemp = new int[zeroCount];
        int[] noZeroTemp = new int[nozeroCount];
        int k = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroTemp[k++] = nums[i];
            } else {
                noZeroTemp[j++] = nums[i];
            }
        }

        for (int i = 0; i < noZeroTemp.length; i++) {
            nums[i] = noZeroTemp[i];
        }
        for (j = 0; j < zeroTemp.length; j++) {
            nums[j + nozeroCount] = zeroTemp[j];
        }
    }
}
