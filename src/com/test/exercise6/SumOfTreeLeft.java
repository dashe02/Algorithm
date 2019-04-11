package com.test.exercise6;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/10.
 */
public class SumOfTreeLeft {
    static int sum = 0;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        sumOfTreeLeft(root);
        System.out.print(sum);
    }

    private static void sumOfTreeLeft(TreeNode root) {
        if (root == null) return;
        if (root.left != null) {
            sum += root.left.val;
        }
        sumOfTreeLeft(root.left);
        sumOfTreeLeft(root.right);
    }
}
