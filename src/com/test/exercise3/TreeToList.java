package com.test.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/31.
 * 1
 * / \
 * 2  5
 * / \  \
 * 3  4  6
 */
public class TreeToList {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeToList t = new TreeToList();
        t.treeToList(root);
        while (root != null) {
            System.out.print(root.val);
            root = root.right;
        }
    }

    private void treeToList(TreeNode root) {
        if (root == null) return;
        treeToList(root.right);
        treeToList(root.left);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) root = root.right;
        root.right = temp;
    }
}
