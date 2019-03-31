package com.exercise3;

import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/29.
 */
public class KSmallestFromTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode lr = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.right = lr;
        KSmallestFromTree k = new KSmallestFromTree();
        int min = k.ksmallestFromTree(root, 1);
        System.out.print(min);
    }

    private int ksmallestFromTree(TreeNode root, int k) {
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        if (list.size() >= k) {
            return list.get(k - 1);
        }
        return 0;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
