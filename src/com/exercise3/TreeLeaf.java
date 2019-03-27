package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/27.
 */
public class TreeLeaf {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeLeaf t = new TreeLeaf();
        t.treeLeaf(root);
        System.out.print(list);
    }

    private void treeLeaf(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        treeLeaf(root.left);
        treeLeaf(root.right);
    }
}
