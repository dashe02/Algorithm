package com.exercise8;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/16.
 */
public class BinaryTreePaths {
    List<List<Integer>> pathList = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        List<List<Integer>> lists = help(root);
        List<String> result = new ArrayList<>();
        for (List<Integer> list : lists) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                Integer a = list.get(i);
                if (i == list.size() - 1) {
                    sb.append(a);
                } else {
                    sb.append(a).append("->");
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

    private List<List<Integer>> help(TreeNode root) {
        if (root == null) {
            return pathList;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
        }
        help(root.left);
        help(root.right);
        path.remove(path.size() - 1);
        return pathList;
    }

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        BinaryTreePaths b = new BinaryTreePaths();
        List<String> res = b.binaryTreePaths(root);
        System.out.print(res);
    }
}
