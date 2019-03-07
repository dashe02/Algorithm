package com.test.test.tree;

/**
 * Created by wecash on 19/3/6.
 */
public class BinaryTreeMaxDeep {

    public static void main(String[] args) {
        BinaryTreeNode root = CommonValue.buildTree();
        BinaryTreeMaxDeep d = new BinaryTreeMaxDeep();
        System.out.println(d.getMaxDeep(root));
    }

    private int getMaxDeep(BinaryTreeNode root) {
        if (root == null) return 0;
        int leftDeep = getMaxDeep(root.left);
        int rightDeep = getMaxDeep(root.right);
        return Math.max(leftDeep, rightDeep) + 1;
    }
}
