package com.test.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wecash on 19/4/4.
 */
public class PrintTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        PrintTree p = new PrintTree();
        p.printTree(root);
    }

    private void printTree(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<List<Integer>> lists = new ArrayList<>();
        while (!queue.isEmpty()) {
            int count = 0;
            int last = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count < last) {
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
