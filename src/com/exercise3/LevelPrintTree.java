package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;
import com.test.exercise.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wecash on 19/4/3.
 */
public class LevelPrintTree {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        LevelPrintTree l = new LevelPrintTree();
        l.levelPrintTree(root);
    }

    private void levelPrintTree(TreeNode root) {
        if (root == null) return;
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int count;
        int last;
        while (!queue.isEmpty()) {
            count = 0;
            last = queue.size();
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
        System.out.println(lists);
    }
}
