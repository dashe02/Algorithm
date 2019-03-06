package com.example.tree;

/**
 * Created by wecash on 19/3/6.
 */
public class DumpTree {

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(8);
        BinaryTree l = new BinaryTree(6);
        BinaryTree r = new BinaryTree(10);
        BinaryTree ll = new BinaryTree(5);
        BinaryTree lr = new BinaryTree(7);
        BinaryTree rl = new BinaryTree(9);
        BinaryTree rr = new BinaryTree(11);

        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;

        dumpTree(root);

        preOrder(root);


    }

    private static void preOrder(BinaryTree root) {
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void dumpTree(BinaryTree root) {
        //左右子树翻转
        if (root == null) return;
        BinaryTree left = root.left;
        BinaryTree right = root.right;
        BinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
        dumpTree(left);
        dumpTree(right);
    }

}
