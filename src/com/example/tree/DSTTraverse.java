package com.example.tree;

import java.util.Stack;

/**
 * Created by wecash on 19/2/21.
 * 深度优先遍历
 * * 二叉树翻转
 * 4                   4
 * / \                 / \
 * 2  7      --->     7   2
 * /\  /\            /\   /\
 * 1 3 6 9          9 6  3 1
 */
public class DSTTraverse {

    public void dstTraverse(BinaryTree root) {
        if (root == null) return;
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTree node = stack.pop();
            System.out.println(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
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
        DSTTraverse d = new DSTTraverse();
        d.dstTraverse(root);
    }
}
