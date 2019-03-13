package com.example.tree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Map;

/**
 * Created by wecash on 19/3/10.
 */
public class BinaryTreeMaxWidth {

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
        BinaryTreeMaxWidth w = new BinaryTreeMaxWidth();
        System.out.print(w.getMaxWidth(root));
    }

    private int getMaxWidth(BinaryTree root) {
        if (root == null) return 0;
        ArrayDeque<BinaryTree> queue = new ArrayDeque<>();
        int maxWidth = 1;
        queue.add(root);
        while (true) {
            int len = queue.size();
            if (len == 0) break;
            while (len > 0) {
                BinaryTree tree = queue.pop();
                len--;
                if (tree.left != null) {
                    queue.add(tree.left);
                }
                if (tree.right != null) {
                    queue.add(tree.right);
                }
            }
            maxWidth = Math.max(maxWidth, queue.size());
        }
        return maxWidth;
    }


}
