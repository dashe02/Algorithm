package com.exercise6;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.*;

/**
 * Created by wecash on 19/4/11.
 */
public class PrintTree {
    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        printTree(root);
    }

    private static void printTree(TreeNode root) {
        if (root == null) return;
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = 0;
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count < len) {
                TreeNode node = queue.poll();
                list.add(node.val);
                count++;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            lists.add(list);
        }
        System.out.print(lists);
    }
}
