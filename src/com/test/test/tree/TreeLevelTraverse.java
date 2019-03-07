package com.test.test.tree;

import java.util.ArrayDeque;

/**
 * Created by wecash on 19/3/6.
 */
public class TreeLevelTraverse {

    public static void main(String[] args) {
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
        TreeLevelTraverse t = new TreeLevelTraverse();
        t.levelTraverse(root);
    }

    private void levelTraverse(BinaryTreeNode root) {
        if (root == null) return;
        //System.out.println(root.value);
        ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.pop();
            System.out.println(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
