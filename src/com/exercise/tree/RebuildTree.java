package com.exercise.tree;

import java.util.ArrayDeque;

/**
 * Created by wecash on 19/3/12.
 *                     1
 *                    / \
 *                   2   3
 *                  /\  / \
 *                 4 5  6  7
 *                /
 *               8
 *  https://blog.csdn.net/roycon/article/details/79772639
 */
public class RebuildTree {

    public static void main(String[] args) {
        RebuildTree tree = new RebuildTree();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = tree.rebuildTree(pre, in);
        tree.levelTraverse(root);
    }

    private void levelTraverse(TreeNode root) {
        if (root == null) return;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            System.out.println(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private TreeNode rebuildTree(int[] pre, int[] in) {
        int pLen = pre.length;
        int inLen = in.length;
        if (pLen == 0 && inLen == 0) {
            return null;
        }
        return btConsturct(pre, in, 0, pLen - 1, 0, inLen - 1);
    }


    private TreeNode btConsturct(int[] pre, int[] in, int pStart, int pEnd, int inStart, int inEnd) {
        TreeNode tree = new TreeNode(pre[pStart]);
        tree.left = null;
        tree.right = null;
        if (pStart == pEnd && inStart == inEnd) {
            return tree;
        }
        int root = 0;
        for (root = inStart; root < inEnd; root++) {
            if (pre[pStart] == in[root]) {
                break;
            }
        }
        int leftLength = root - inStart;
        int rightlength = inEnd - root;
        if (leftLength > 0) {
            tree.left = btConsturct(pre, in, pStart + 1, pStart + leftLength, inStart, root - 1);
        }
        if (rightlength > 0) {
            tree.right = btConsturct(pre, in, pStart + leftLength + 1, pEnd, root + 1, inEnd);
        }
        return tree;
    }
}
