package com.exercise4;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/6.
 */
public class ArrayToTree {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayToTree a = new ArrayToTree();
        TreeNode root = a.arrayToTree(nums);
        preOrder(root);
    }

    private TreeNode arrayToTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }


    private TreeNode build(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = build(nums, left, mid - 1);
            root.right = build(nums, mid + 1, right);
            return root;
        }
        return null;
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}

