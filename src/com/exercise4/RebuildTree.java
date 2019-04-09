package com.exercise4;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/6.
 */
public class RebuildTree {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        RebuildTree r = new RebuildTree();
        r.rebuildTree(pre, in);
    }

    private void rebuildTree(int[] pre, int[] in) {
        TreeNode root = constructTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        preOrder(root);
    }

    private void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    private TreeNode constructTree(int[] pre, int pStart, int pEnd, int[] in, int iStart, int iEnd) {

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
        int leftLen = root - iStart;
        int rightLen = iEnd - root;
        if (leftLen > 0) {
            tree.left = constructTree(pre, pStart + 1, pStart + leftLen, in, iStart, root - 1);
        }
        if (rightLen > 0) {
            tree.right = constructTree(pre, pStart + leftLen + 1, pEnd, in, root + 1, iEnd);
        }
        return tree;
    }
}
