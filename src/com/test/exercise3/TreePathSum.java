package com.test.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/31.
 */
public class TreePathSum {

    List<List<Integer>> pathList = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        int target = 10;
        TreePathSum t = new TreePathSum();
        System.out.print(t.treePathSum(root, target));
    }

    private List<List<Integer>> treePathSum(TreeNode root, int target) {
        if (root == null)
            return pathList;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
            return pathList;
        }
        if (root.left != null) {
            treePathSum(root.left, target);
        }
        if (root.right != null) {
            treePathSum(root.right, target);
        }
        path.remove(path.size() - 1);
        return pathList;
    }
}
