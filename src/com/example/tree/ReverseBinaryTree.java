package com.example.tree;

/**
 * Created by wecash on 19/2/21.
 * 二叉树翻转
 * <p>
 * 4                    4
 * / \                 / \
 * 2  7      --->     7   2
 * /\  /\            /\   /\
 * 1 3 6 9          9 6  3 1
 */
public class ReverseBinaryTree {

    public void reverseBinaryTree(BinaryTree root) {

        if (root == null) return;
        swap(root);
        reverseBinaryTree(root.left);
        reverseBinaryTree(root.right);
    }

    private void swap(BinaryTree root) {
        BinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public void preOrder(BinaryTree root) {
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(4);
        BinaryTree l = new BinaryTree(2);
        BinaryTree r = new BinaryTree(7);
        BinaryTree ll = new BinaryTree(1);
        BinaryTree lr = new BinaryTree(3);
        BinaryTree rl = new BinaryTree(6);
        BinaryTree rr = new BinaryTree(9);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        ReverseBinaryTree t = new ReverseBinaryTree();
        t.reverseBinaryTree(root);
        t.preOrder(root);
    }

}
