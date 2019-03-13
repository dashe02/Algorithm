package com.exercise.tree;

import com.test.example.QuickSort;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * Created by wecash on 19/3/13.
 */
public class PrintTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        PrintTree p = new PrintTree();
        p.printTree(root);
    }

    private void printTree(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> queue1 = new Stack<>();
        Stack<TreeNode> queue2 = new Stack<>();
        boolean isReverse = false;
        queue1.add(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!isReverse) {
                while (!queue1.isEmpty()) {
                    TreeNode node = queue1.pop();
                    System.out.print(node.val);
                    if (node.left != null) {
                        queue2.push(node.left);
                    }
                    if (node.right != null) {
                        queue2.push(node.right);
                    }
                }
                isReverse = true;
            } else {
                while (!queue2.isEmpty()) {
                    TreeNode node = queue2.pop();
                    System.out.print(node.val);
                    if (node.right != null) {
                        queue1.push(node.right);
                    }
                    if (node.left != null) {
                        queue1.push(node.left);
                    }
                }
                isReverse = false;
            }

        }
    }

}

