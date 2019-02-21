package com.example.tree;

import java.util.ArrayDeque;

/**
 * Created by wecash on 19/2/21.
 */
public class BSTTraverse {

    public void bstTraverse(BinaryTree root) {
        if (root == null) return;
        ArrayDeque<BinaryTree> queue = new ArrayDeque<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.pop();
            System.out.println(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
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
        BSTTraverse b = new BSTTraverse();
        b.bstTraverse(root);
    }
}
