package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.Stack;

/**
 * Created by wecash on 19/3/27.
 */
public class TreeMinLeverse {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeMinLeverse t = new TreeMinLeverse();
        t.treeMidLeverse(root);
    }

    private void treeMidLeverse(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

}
