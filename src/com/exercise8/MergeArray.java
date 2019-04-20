package com.exercise8;

import java.util.Arrays;

/**
 * Created by wecash on 19/4/19.
 */
public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }
        nums1 = new int[result.length];
        for (int k1 = 0; k1 < result.length; k1++) {
            nums1[k1] = result[k1];
        }
        System.out.print(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeArray m = new MergeArray();
        m.merge(nums1, 3, nums2, 3);
    }
}
