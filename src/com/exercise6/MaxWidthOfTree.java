package com.exercise6;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;
import com.test.exercise.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by wecash on 19/4/11.
 */
public class MaxWidthOfTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        MaxWidthOfTree m = new MaxWidthOfTree();
        int maxWidth = m.maxWidthOfTree(root);
        System.out.print(maxWidth);
    }

    private int maxWidthOfTree(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        int maxWidth = 1;
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            if (len == 0) break;
            while (len > 0) {
                TreeNode node = queue.poll();
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
