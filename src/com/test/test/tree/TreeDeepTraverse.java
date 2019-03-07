package com.test.test.tree;

import java.util.Stack;

/**
 * Created by wecash on 19/3/6.
 */
public class TreeDeepTraverse {

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
        TreeDeepTraverse t = new TreeDeepTraverse();
        t.deepTraverse(root);
    }

    private void deepTraverse(BinaryTreeNode root) {
        if (root == null) return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            System.out.println(node.value);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}
