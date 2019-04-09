package com.exercise5;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/7.
 */
public class BuildTreeFromArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BuildTreeFromArray b = new BuildTreeFromArray();
        TreeNode root = b.buildTreeFromArray(nums);
        preOrder(root);
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    private TreeNode buildTreeFromArray(int[] nums) {
        return buildTreeFromArray0(nums, 0, nums.length);
    }

    private TreeNode buildTreeFromArray0(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = buildTreeFromArray0(nums, left, mid - 1);
            root.right = buildTreeFromArray0(nums, mid + 1, right);
            return root;
        }
        return null;
    }
}
