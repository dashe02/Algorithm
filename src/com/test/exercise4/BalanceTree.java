package com.test.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/4.
 */
public class BalanceTree {

    boolean isBalance = false;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        BalanceTree b = new BalanceTree();
        System.out.print(b.balanceTree(root));
    }

    private boolean balanceTree(TreeNode root) {
        getDepth(root);
        return isBalance;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            isBalance = true;
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        int deepth = Math.max(left, right) + 1;
        if (Math.abs(left - right) <= 1) {
            isBalance = true;
        } else {
            isBalance = false;
        }
        return deepth;
    }
}
