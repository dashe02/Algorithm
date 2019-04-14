package com.exercise7;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/13.
 */
public class FindCommonAnster {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(5);
        findCommonAnster(root, p, q);
    }


    private static TreeNode findCommonAnster(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = findCommonAnster(root.left, p, q);
        TreeNode right = findCommonAnster(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
