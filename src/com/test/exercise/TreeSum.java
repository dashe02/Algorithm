package com.test.exercise;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/25.
 */
public class TreeSum {
    List<List<Integer>> pathList = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        int target = 10;
        TreeSum t = new TreeSum();
        System.out.print(t.treeSum(root, target));
    }

    private List<List<Integer>> treeSum(TreeNode root, int target) {
        if (root == null) {
            return pathList;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
            return pathList;
        }
        if (root.left != null) {
            treeSum(root.left, target);
        }
        if (root.right != null) {
            treeSum(root.right, target);
        }
        path.remove(path.size() - 1);
        return pathList;
    }
}
