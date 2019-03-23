package com.exercise1;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/21.
 */
public class TreePathSum {

    private int result = 0;

    private int num = 0;

    public int sumNumbers(TreeNode root) {
        sum(root);
        return result;
    }

    private void sum(TreeNode root) {
        if (root != null) {
            num = num * 10 + root.val;
            if (root.left == null && root.right == null) {
                result += num;
            }
            sum(root.left);
            sum(root.right);
            num /= 10;
        }
    }

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreePathSum t = new TreePathSum();
        System.out.print(t.sumNumbers(root));
    }

}
