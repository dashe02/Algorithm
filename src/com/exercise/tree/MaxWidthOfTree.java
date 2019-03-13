package com.exercise.tree;

import java.util.ArrayDeque;

/**
 * Created by wecash on 19/3/12.
 */
public class MaxWidthOfTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        MaxWidthOfTree tree = new MaxWidthOfTree();
        System.out.print(tree.maxWidthOfTree(root));
    }

    private int maxWidthOfTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 1;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (true) {
            int len = queue.size();
            if (len == 0) break;
            while (len > 0) {
                TreeNode node = queue.pop();
                len--;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            maxWidth = Math.max(maxWidth, queue.size());
        }
        return maxWidth;
    }
}
