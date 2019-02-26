package com.test.test.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by wecash on 19/2/26.
 * 1
 * / \
 * 2   3
 * /\  /\
 * 4 5 6 7
 */
public class LevelTraverse {

    public static void main(String[] args) {
        BinaryTreeNode root = CommonValue.buildTree();
        LevelTraverse le = new LevelTraverse();
        le.levelTraverse(root);
    }

    private void levelTraverse(BinaryTreeNode root) {
        if (root == null) return;
        Deque<BinaryTreeNode> queue = new ArrayDeque<>();
        queue.push(root);
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
