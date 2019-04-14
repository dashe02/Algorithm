package com.exercise7;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.Stack;

/**
 * Created by wecash on 19/4/13.
 */
public class TreeTraverse {
    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        System.out.println("前序遍历");
        preOrder(root);
        System.out.println();
        System.out.println("中序遍历");
        inOrder(root);
        System.out.println();
        System.out.println("后序遍历");
        postOrder(root);
        System.out.println();
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                System.out.print(p.val + "---");
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                p = p.right;
            }
        }
    }


    private static void inOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                System.out.print(p.val + "---");
                p = p.right;
            }
        }

    }

    private static void postOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            s2.push(node);
            if (node.left != null) {
                s1.push(node.left);
            }
            if (node.right != null) {
                s1.push(node.right);
            }
        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop().val+"---");
        }
    }
}
