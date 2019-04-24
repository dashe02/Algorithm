package com.exercise8;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/20.
 */
public class MinDeep {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        } else if (root.right != null && root.left == null) {
            return minDepth(root.right) + 1;
        } else {
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            return Math.min(left, right) + 1;
        }
    }
}
