package com.example.tree;

/**
 * Created by wecash on 19/2/16.
 * 求二叉树的最大路径
 */
public class BinaryTreeMaxPath {

    public int getPath(BinaryTree root) {
        if (root == null) {
            return 0;
        }
        int left = getPath(root.left);
        int right = getPath(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        BinaryTree l1 = new BinaryTree(4);
        BinaryTree r1 = new BinaryTree(5);
        BinaryTree ll1 = new BinaryTree(7);
        BinaryTree lr1 = new BinaryTree(0);
        BinaryTree rl1 = new BinaryTree(3);
        BinaryTree rr1 = new BinaryTree(2);
        BinaryTree rll1 = new BinaryTree(10);
        BinaryTree rlr1 = new BinaryTree(12);
        root.left = l1;
        root.right = r1;
        l1.left = ll1;
        l1.right = lr1;
        r1.left = rl1;
        r1.right = rr1;
        rl1.left = rll1;
        rl1.right = rlr1;
        BinaryTreeMaxPath maxPath=new BinaryTreeMaxPath();
        System.out.println(maxPath.getPath(root));
    }
}
