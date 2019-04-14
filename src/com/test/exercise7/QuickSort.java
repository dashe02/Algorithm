package com.test.exercise7;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/13.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 0, 3, 6, 4, 7};
        QuickSort q = new QuickSort();
        q.quickSort(nums, 0, nums.length - 1);
        System.out.print(Arrays.toString(nums));
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left > right) return;
        int temp = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= temp)
                j--;
            while (i < j && nums[i] <= temp)
                i++;
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[left] = nums[i];
        nums[i] = temp;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }
}
