package com.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;
import com.test.exercise.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wecash on 19/4/6.
 */
public class PrintTreeToOne {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        PrintTreeToOne p = new PrintTreeToOne();
        p.printTreeToOne(root);
    }

    private void printTreeToOne(TreeNode root) {
        if (root == null) return;
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = 0;
            int last = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count < last) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                count++;
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            lists.add(list);
        }
        System.out.print(lists);
    }
}
