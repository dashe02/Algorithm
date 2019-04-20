package com.exercise8;

import java.util.*;

/**
 * Created by wecash on 19/4/19.
 */
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer index = map.get(nums1[i]);
            if (index == null) {
                list.add(-1);
            } else {
                list.add(findIndex(nums2, index));
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private int findIndex(int[] nums2, Integer index) {
        int j = index + 1;
        while (j < nums2.length) {
            if (nums2[j] > nums2[index]) {
                return nums2[j];
            }
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        NextGreaterElement n = new NextGreaterElement();
        System.out.print(Arrays.toString(n.nextGreaterElement(nums1, nums2)));
    }
}
