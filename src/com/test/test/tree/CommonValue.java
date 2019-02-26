package com.test.test.tree;

/**
 * Created by wecash on 19/2/26.
 */
public class CommonValue {

    public static BinaryTreeNode buildTree() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode l = new BinaryTreeNode(2);
        BinaryTreeNode r = new BinaryTreeNode(3);
        BinaryTreeNode ll = new BinaryTreeNode(4);
        BinaryTreeNode lr = new BinaryTreeNode(5);
        BinaryTreeNode rl = new BinaryTreeNode(6);
        BinaryTreeNode rr = new BinaryTreeNode(7);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        return root;
    }
}
