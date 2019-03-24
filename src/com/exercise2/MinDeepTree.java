package com.exercise2;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/23.
 */
public class MinDeepTree {
    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        MinDeepTree m = new MinDeepTree();
        System.out.print(m.minDeepTree(root));
    }

    private int minDeepTree(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return minDeepTree(root.right) + 1;
        if (root.right == null) return minDeepTree(root.left) + 1;
        int left = minDeepTree(root.left);
        int right = minDeepTree(root.right);
        return Math.min(left, right) + 1;
    }
}
