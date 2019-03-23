package com.exercise1;

import com.exercise.tree.TreeNode;

import java.util.ArrayDeque;

/**
 * Created by wecash on 19/3/22.
 */
public class RebuildTree {

    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        RebuildTree r = new RebuildTree();
        r.rebuildTree(preOrder, inOrder);
    }

    private void rebuildTree(int[] preOrder, int[] inOrder) {
        TreeNode root = construct(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
        levelTraverse(root);
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

    private TreeNode construct(int[] preOrder, int[] inOrder, int pStart, int pEnd, int iStart, int iEnd) {
        TreeNode root = new TreeNode(preOrder[pStart]);
        root.left = null;
        root.right = null;
        if (pStart == pEnd && iStart == iEnd) {
            return root;
        }
        int rootIndex = 0;
        for (rootIndex = iStart; rootIndex < iEnd; rootIndex++) {
            if (preOrder[0] == inOrder[rootIndex]) {
                break;
            }
        }
        int leftLength = rootIndex - iStart;
        int rightLength = iEnd - rootIndex;
        if (leftLength > 0) {
            root.left = construct(preOrder, inOrder, pStart + 1, pEnd + leftLength, iStart, rootIndex - 1);
        }
        if (rightLength > 0) {
            root.right = construct(preOrder, inOrder, pStart + leftLength + 1, pEnd, rootIndex + 1, iEnd);
        }
        return root;
    }
}
