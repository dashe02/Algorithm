package com.exercise3;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/29.
 */
public class LoopArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        LoopArray l = new LoopArray();
        int[] result = l.nextGreaterElements(nums);
        System.out.print(Arrays.toString(result));
    }

    public int[] nextGreaterElements(int[] nums) {
        if (nums == null) return null;
        int[] result = new int[nums.length];
        if (nums.length == 0) return result;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int j;
            if (i == nums.length - 1) {
                j = 0;
            } else {
                j = i;
            }
            j = j + 1;
            boolean isLoop = false;
            while (j < nums.length) {
                if (j == nums.length - 1) {
                    j = 0;
                    isLoop = true;
                } else {
                    if (nums[i] < nums[j]) {
                        result[k++] = nums[j];
                        break;
                    } else {
                        if (isLoop) {
                            result[k++] = -1;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
