package com.test.test.tree;

/**
 * Created by wecash on 19/3/6.
 */
public class BinaryTreeMinDeep {

    public static void main(String[] args) {
        BinaryTreeNode root = CommonValue.buildTree();
        BinaryTreeMinDeep minDeep = new BinaryTreeMinDeep();
        System.out.print(minDeep.findMinDeep(root));
    }

    private int findMinDeep(BinaryTreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return findMinDeep(root.right) + 1;
        if (root.right == null) return findMinDeep(root.left) + 1;
        int left = findMinDeep(root.left);
        int right = findMinDeep(root.right);
        return Math.min(left, right) + 1;
    }
}
