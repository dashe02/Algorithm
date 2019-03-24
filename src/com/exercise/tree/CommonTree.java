package com.exercise.tree;

/**
 * Created by wecash on 19/3/12.
 *                1
 *               / \
 *              2  3
 *             /\  /\
 *            4 5 6 7
 */
public class CommonTree {

    public static TreeNode createTree() {
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(5);
        TreeNode rl = new TreeNode(6);
        TreeNode rr = new TreeNode(7);
        TreeNode lll = new TreeNode(8);
        TreeNode llr = new TreeNode(9);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        ll.left=lll;
        ll.right=llr;
        return root;
    }
}
