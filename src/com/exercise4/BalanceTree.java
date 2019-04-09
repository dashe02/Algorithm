package com.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/6.
 */
public class BalanceTree {

    boolean isBalance = false;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        BalanceTree b = new BalanceTree();
        boolean isBalance = b.isBalance(root);
        System.out.print(isBalance);
    }

    private boolean isBalance(TreeNode root) {
        getDeepth(root);
        return isBalance;
    }

    private int getDeepth(TreeNode root) {
        if (root == null) {
            isBalance = true;
            return 0;
        }
        int left = getDeepth(root.left);
        int right = getDeepth(root.right);
        int deep = Math.max(left, right) + 1;
        if (Math.abs(left - right) <= 1) {
            isBalance = true;
        } else {
            isBalance = false;
        }
        return deep;
    }
}
