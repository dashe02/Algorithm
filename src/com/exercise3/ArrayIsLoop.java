package com.exercise3;

/**
 * Created by wecash on 19/3/26.
 */
public class ArrayIsLoop {
    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i, k = getNextIndex(nums, i);
            while (nums[i] * nums[j] > 0 && nums[j] * nums[k] > 0
                    && nums[i] * nums[getNextIndex(nums, k)] > 0) {
                if (j == k) {
                    if (j == getNextIndex(nums, j)) {
                        break;
                    }
                    return true;
                }
                j = getNextIndex(nums, j);
                k = getNextIndex(nums, getNextIndex(nums, k));
            }
        }
        return false;
    }

    private int getNextIndex(int[] nums, int i) {
        int length = nums.length;
        int next = i + nums[i];
        return next > 0 ? next % length : length + next % length;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -1, -2, -2};
        ArrayIsLoop a = new ArrayIsLoop();
        System.out.print(a.circularArrayLoop(nums));
    }
}
