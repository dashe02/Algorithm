package com.exercise2;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/23.
 */
public class MaxDeepOfTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        MaxDeepOfTree m = new MaxDeepOfTree();
        int deep = m.maxDeepOfTree(root);
        System.out.print(deep);
    }

    private int maxDeepOfTree(TreeNode root) {
        if (root == null) return 0;
        int left = maxDeepOfTree(root.left);
        int right = maxDeepOfTree(root.right);
        return Math.max(left, right) + 1;
    }
}
