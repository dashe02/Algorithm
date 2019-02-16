package com.example.tree;

/**
 * Created by wecash on 19/2/16.
 */
public class BinaryTreeIsBalance {

    /**
     * 判断一个二叉树是否平衡二叉树
     * 平衡二叉树的定义：具有以下性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树
     */

    private boolean isBalance = true;

    public boolean binaryTreeIsBalance(BinaryTree root) {
        getDepth(root);
        return isBalance;
    }

    private int getDepth(BinaryTree root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(right - left) > 1) {
            isBalance = false;
        }
        return right > left ? right + 1 : left + 1;
    }

}
