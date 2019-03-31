package com.exercise3;

/**
 * Created by wecash on 19/3/28.
 */
public class KSmall {

    public static void main(String[] args) {
        int[] nums1 = {1, 5, 8, 10};
        int[] nums2 = {2, 4, 6, 8, 10};
        int n = 6;
        KSmall k = new KSmall();
        int kSmall = k.kSmall(nums1, nums2, n);
        System.out.print(kSmall);
    }

    //1 2 4 5 6 8
    private int kSmall(int[] nums1, int[] nums2, int n) {
        int count = 0;
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < nums1.length && j < nums2.length) {
            if (count == n - 1) {
                return max;
            }
            if (nums1[i] > nums2[j]) {
                max = nums1[i];
                j++;
            } else {
                max = nums2[j];
                i++;
            }
            count++;
        }
        return 0;
    }
}
