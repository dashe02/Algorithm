package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/27.
 */
public class TreeTransferToDNode {

    TreeNode head = null;
    TreeNode tail = null;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeTransferToDNode t = new TreeTransferToDNode();
        TreeNode result = t.transfer(root);
        while (result != null) {
            System.out.print(result.val);
            result = result.right;
        }
    }

    private TreeNode transfer(TreeNode root) {
        if (root==null) return null;
        transfer(root.left);
        createList(root);
        transfer(root.right);
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
