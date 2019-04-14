package com.exercise6;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/11.
 */
public class LowestCommonAnster {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(5);
        TreeNode node = lowestCommonAnster(root, p, q);
    }

    private static TreeNode lowestCommonAnster(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAnster(root.left, p, q);
        TreeNode right = lowestCommonAnster(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
}
