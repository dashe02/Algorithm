package com.exercise6;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/11.
 */
public class TreeToDoubleList {

    TreeNode first;

    TreeNode last;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeToDoubleList t = new TreeToDoubleList();
        TreeNode node = t.treeToDoubleList(root);
        while (node != null) {
            System.out.print(node.val);
            node = node.right;
        }
    }

    private TreeNode treeToDoubleList(TreeNode root) {
        if (root == null) return null;
        treeToDoubleList(root.left);
        createList(root);
        treeToDoubleList(root.right);
        return first;
    }

    private void createList(TreeNode cur) {
        cur.left = last;
        if (last != null) {
            last.right = cur;
        } else {
            first = cur;
        }
        last = cur;
    }
}
