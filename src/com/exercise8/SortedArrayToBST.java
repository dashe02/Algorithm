package com.exercise8;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/15.
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length - 1);
    }

    private TreeNode help(int[] nums, int left, int right) {
        int mid = left + (right - left) / 2;

        return null;
    }
}
