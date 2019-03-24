package com.exercise2;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/24.
 */
public class TreePathOfTarget {

    List<List<Integer>> pathList = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        int target = 10;
        TreePathOfTarget t = new TreePathOfTarget();
        System.out.print(t.treePathOfTarget(root, target));
    }

    private List<List<Integer>> treePathOfTarget(TreeNode root, int sum) {
        if (root == null) {
            return pathList;
        }
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
        }
        if (root.left != null) {
            treePathOfTarget(root.left, sum);
        }
        if (root.right != null) {
            treePathOfTarget(root.right, sum);
        }
        path.remove(path.size() - 1);
        return pathList;
    }
}
