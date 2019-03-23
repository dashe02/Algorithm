package com.exercise1;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by wecash on 19/3/23.
 */
public class MaxWidthOfTree {
    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        MaxWidthOfTree m = new MaxWidthOfTree();
        int width = m.maxWidthOfTree(root);
        System.out.print(width);
    }

    private int maxWidthOfTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 1;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (true) {
            int len = queue.size();
            if (len == 0) break;
            while (len > 0) {
                TreeNode node = queue.pop();
                len--;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            maxWidth = Math.max(maxWidth, queue.size());
        }
        return maxWidth;
    }
}
