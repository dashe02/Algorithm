package com.exercise.tree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wecash on 19/3/15.
 */
public class TreeSum {

    private static List<List<Integer>> pathList = new ArrayList<>();

    private List<Integer> path = new ArrayList<>();


    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        int sum = 10;
        TreeSum t = new TreeSum();
        t.treeSum(root, sum);
        System.out.println(pathList);
    }

    private void treeSum(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        sum = sum - root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
        }
        if (root.left != null) {
            treeSum(root.left, sum);
        }
        if (root.right != null) {
            treeSum(root.right, sum);
        }
        path.remove(path.size() - 1);
    }
}
