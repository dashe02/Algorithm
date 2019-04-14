package com.test.exercise7;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/12.
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 2, 0, 8, 9, 6};
        HeapSort h = new HeapSort();
        h.heapSort(nums);
        System.out.print(Arrays.toString(nums));
    }

    private void heapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--)
            hepify(i, nums.length, nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            swap(0, i, nums);
            hepify(0, i, nums);
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void hepify(int parent, int length, int[] nums) {
        int child = parent * 2 + 1;
        int temp = nums[parent];
        while (child < length) {
            if (child + 1 < length && nums[child] < nums[child + 1])
                child++;
            if (nums[child] <= temp) break;
            nums[parent] = nums[child];
            parent = child;
            child = child * 2 + 1;
        }
        nums[parent] = temp;
    }
}
