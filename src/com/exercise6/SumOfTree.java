package com.exercise6;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/11.
 */
public class SumOfTree {

    static List<List<Integer>> pathList = new ArrayList<>();

    static List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        int sum = 10;
        SumOfTree s = new SumOfTree();
        s.sumOfTree(root, sum);
        System.out.print(pathList);
    }

    private void sumOfTree(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
            return;
        }
        sumOfTree(root.left, sum);
        sumOfTree(root.right, sum);
        path.remove(path.size() - 1);
    }

}
