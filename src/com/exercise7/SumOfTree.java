package com.exercise7;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;
import com.test.test.array.SumOfArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/13.
 */
public class SumOfTree {

    List<List<Integer>> pathList = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        int sum = 10;
        SumOfTree s = new SumOfTree();
        System.out.print(s.sumOfTree(root, sum));
    }

    private List<List<Integer>> sumOfTree(TreeNode root, int sum) {
        if (root == null) {
            return pathList;
        }
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
            return pathList;
        }
        sumOfTree(root.left, sum);
        sumOfTree(root.right, sum);
        path.remove(path.size() - 1);
        return pathList;
    }
}
