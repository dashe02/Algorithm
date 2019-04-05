package com.test.exercise2;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wecash on 19/4/1.
 */
public class CompleteTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        CompleteTree c = new CompleteTree();
        boolean isCompleteTree = c.completeTree(root);
        System.out.print(isCompleteTree);
    }

    private boolean completeTree(TreeNode root) {
        if (root == null) return false;
        Queue<TreeNode> queue = new ArrayDeque<>();
        //这里标记是否出现过一个满节点
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (flag) {
                //如果出现过满节点,左子树或者右子树不为空
                if (treeNode.left != null || treeNode.right != null) {
                    return false;
                }
            } else {
                if (treeNode.left != null && treeNode.right != null) {
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                } else if (treeNode.left == null && treeNode.right != null) {
                    return false;
                } else if (treeNode.left != null && treeNode.right == null) {
                    queue.add(treeNode.left);
                    flag = true;
                } else {
                    flag = true;
                }
            }
        }
        return true;
    }
}
