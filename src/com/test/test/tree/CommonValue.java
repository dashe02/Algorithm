package com.test.test.tree;

/**
 * Created by wecash on 19/2/26.
 * 1
 * / \
 * 2  3
 * /\  /\
 * 4 5 6 7
 * /\  /\
 * 8 9 12 13
 * /\
 * 10 11
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
        BinaryTreeNode lll = new BinaryTreeNode(8);
        BinaryTreeNode llr = new BinaryTreeNode(9);
        BinaryTreeNode llll = new BinaryTreeNode(10);
        BinaryTreeNode lllr = new BinaryTreeNode(11);
        BinaryTreeNode rll = new BinaryTreeNode(12);
        BinaryTreeNode rlr = new BinaryTreeNode(13);
        BinaryTreeNode rrl = new BinaryTreeNode(14);
        BinaryTreeNode rrr = new BinaryTreeNode(15);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        ll.left = lll;
        ll.right = llr;
        lll.left = llll;
        lll.right = lllr;
        rl.left = rll;
        rl.right = rlr;
        rr.left = rrl;
        rr.right = rrr;
        return root;
    }
}
