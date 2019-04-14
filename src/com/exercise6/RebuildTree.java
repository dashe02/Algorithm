package com.exercise6;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/11.
 */
public class RebuildTree {

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        rebuildTree(pre, in);
    }

    private static void rebuildTree(int[] pre, int[] in) {
        TreeNode node = constructTree(pre, 0, pre.length - 1, in,
                0, in.length - 1);
        preOrder(node);

    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    private static TreeNode constructTree(int[] pre, int pStart, int pEnd,
                                          int[] in, int iStart, int iEnd) {
        TreeNode tree = new TreeNode(pre[pStart]);
        tree.left = null;
        tree.right = null;
        int root = 0;
        for (root = 0; root < iEnd; root++) {
            if (pre[pStart] == in[root]) {
                break;
            }
        }
        int leftLength = root - iStart;
        int rightLength = iEnd - root;
        if (leftLength > 0) {
            tree.left = constructTree(pre, pStart + 1, pStart + leftLength,
                    in, iStart, root - 1);
        }
        if (rightLength > 0) {
            tree.right = constructTree(pre, pStart + leftLength + 1, pEnd,
                    in, root + 1, iEnd);

        }
        return tree;
    }


}
