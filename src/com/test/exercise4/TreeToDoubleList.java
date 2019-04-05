package com.test.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/4.
 */
public class TreeToDoubleList {

    TreeNode head;

    TreeNode tail;


    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeToDoubleList t = new TreeToDoubleList();
        TreeNode head = t.treeToDoubleList(root);
        while (head != null) {
            System.out.print(head.val);
            head = head.right;
        }
    }


    private TreeNode treeToDoubleList(TreeNode root) {
        if (root == null) return null;
        treeToDoubleList(root.left);
        createList(root);
        treeToDoubleList(root.right);
        return head;
    }

    //head->cur->tail->null
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
