package com.example.array;

import java.util.Arrays;

/**
 * Created by wecash on 19/3/4.
 */
public class MergeArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeArray m = new MergeArray();
        int[] result = m.mergeArray(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    private int[] mergeArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[n + m];
        while (i < n && j < m) {
            if (nums1[i] <= 0) {
                i++;
            } else if (nums2[j] <= 0) {
                j++;
            } else if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i < n) {
            result[k++] = nums1[i++];
        }
        while (j < m) {
            result[k++] = nums2[j++];
        }
        return result;
    }
}
