package com.exercise7;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/14.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {8, 0, 2, 4, 5, 1, 7, 9};
        MergeSort m = new MergeSort();
        m.mergeSort(nums, 0, nums.length - 1);
        System.out.print(Arrays.toString(nums));
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left == right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        mergeArray(nums, left, mid, right);
    }


    private void mergeArray(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (int k1 = 0; k1 < temp.length; k1++) {
            nums[k1 + left] = temp[k1];
        }
    }

}
