package com.exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/17.
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            temp.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (temp.contains(nums2[i])) {
                result.add(nums2[i]);
                temp.remove(temp.indexOf(nums2[i]));
            }
        }
        int[] r = new int[result.size()];
        int k = 0;
        for (Integer a : result) {
            r[k++] = a;
        }
        return r;
    }

    public static void main(String[] args) {
        Intersect i = new Intersect();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        i.intersect(nums1, nums2);
    }
}
