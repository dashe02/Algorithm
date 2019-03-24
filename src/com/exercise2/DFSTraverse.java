package com.exercise2;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.Stack;

/**
 * Created by wecash on 19/3/23.
 */
public class DFSTraverse {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        DFSTraverse d = new DFSTraverse();
        d.dfsTraverse(root);
    }

    private void dfsTraverse(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
    }
}
