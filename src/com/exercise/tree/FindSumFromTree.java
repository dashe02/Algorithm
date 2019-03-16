package com.exercise.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/14.
 */
public class FindSumFromTree {

    List<List<Integer>> pathList = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        FindSumFromTree f = new FindSumFromTree();
        int sum = 10;
        System.out.println(f.findSum(root, sum));
    }

    private List<List<Integer>> findSum(TreeNode root, int sum) {
        if (root == null) {
            return pathList;
        }
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
        }
        if (root.left != null) {
            findSum(root.left, sum);
        }
        if (root.right != null) {
            findSum(root.right, sum);
        }
        path.remove(path.size() - 1);
        return pathList;
    }
}
