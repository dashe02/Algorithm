package com.exercise2;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/23.
 */
public class RebuildTree {

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        RebuildTree r = new RebuildTree();
        TreeNode root = r.rebuildTree(pre, in);
        preOrder(root);
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    private TreeNode rebuildTree(int[] pre, int[] in) {
        return constructTree(pre, in, 0, pre.length-1, 0, in.length-1);
    }


    private TreeNode constructTree(int[] pre, int[] in, int pStart, int pEnd, int iStart, int iEnd) {
        TreeNode tree = new TreeNode(pre[pStart]);
        tree.left = null;
        tree.right = null;
        if (pStart == pEnd && iStart == iEnd) {
            return tree;
        }
        int root = 0;
        for (root = iStart; root < iEnd; root++) {
            if (in[root] == pre[pStart]) {
                break;
            }
        }
        int leftLength = root - iStart;
        int rightLength = iEnd - root;
        if (leftLength > 0) {
            tree.left = constructTree(pre, in, pStart + 1, pStart + leftLength, iStart, root - 1);
        }
        if (rightLength > 0) {
            tree.right = constructTree(pre, in, pStart + leftLength + 1, pEnd, root + 1, iEnd);
        }
        return tree;
    }
}
