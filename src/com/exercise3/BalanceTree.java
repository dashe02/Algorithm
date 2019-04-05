package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/3.
 */
public class BalanceTree {

    boolean isBalance = false;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        BalanceTree b = new BalanceTree();
        System.out.print(b.isBalanceTree(root));
    }

    private boolean isBalanceTree(TreeNode root) {
        getDeep(root);
        return isBalance;
    }

    private int getDeep(TreeNode root) {
        if (root == null) {
            isBalance = true;
            return 0;
        }
        int left = getDeep(root.left);
        int right = getDeep(root.right);
        int deep = Math.max(left, right);
        if (Math.abs(left - right) <= 1) {
            isBalance = true;
        } else {
            isBalance = false;
        }
        return deep;
    }
}
