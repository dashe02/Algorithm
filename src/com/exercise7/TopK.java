package com.exercise7;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/13.
 */
public class TopK {

    public static void main(String[] args) {
        int[] nums = {1, 8, 0, 3, 6, 5, 2};
        int k = 3;
        TopK t = new TopK();
        int[] result = t.topK(nums, k);
        System.out.print(Arrays.toString(result));
    }

    private int[] topK(int[] nums, int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[i];
        }
        MinHeap minHeap = new MinHeap(result);
        for (int i = k; i < nums.length; i++) {
            int min = minHeap.getRoot();
            if (nums[i] > min) {
                minHeap.setRoot(nums[i]);
            }
        }
        return result;
    }
}
