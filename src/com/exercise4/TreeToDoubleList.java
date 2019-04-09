package com.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/6.
 */
public class TreeToDoubleList {

    TreeNode head;
    TreeNode tail;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeToDoubleList t = new TreeToDoubleList();
        TreeNode node = t.treeToList(root);
        while (node != null) {
            System.out.print(node.val);
            node = node.right;
        }
    }

    private TreeNode treeToList(TreeNode root) {
        if (root == null) return null;
        treeToList(root.left);
        createList(root);
        treeToList(root.right);
        return head;
    }

    private void createList(TreeNode cur) {
        cur.left = tail;
        if (tail != null) {
            tail.right = cur;
        } else {
            head = cur;
        }
        tail = cur;
    }
}
