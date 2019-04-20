package com.exercise8;

import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/16.
 */
public class FindTilt {

    static int sum = 0;

    public void findTilt(TreeNode root) {
        if (root == null) return;
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = root.left.val;
        }
        if (root.right != null) {
            right = root.right.val;
        }
        sum += Math.abs(left - right);
        findTilt(root.left);
        findTilt(root.right);
    }

    public static void main(String[] args) {
        //TreeNode root = CommonTree.createTree();
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        root.right = l;
        FindTilt f = new FindTilt();
        f.findTilt(root);
        System.out.print(sum);
    }
}
