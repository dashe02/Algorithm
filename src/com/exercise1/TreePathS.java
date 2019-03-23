package com.exercise1;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/22.
 */
public class TreePathS {

    static int num = 0;

    static int result = 0;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreePathS t = new TreePathS();
        t.getTreePath(root);
        System.out.print(result);
    }

    private void getTreePath(TreeNode root) {
        if (root != null) {
            num = num * 10 + root.val;
            if (root.left == null && root.right == null) {
                result += num;
            }
            getTreePath(root.left);
            getTreePath(root.right);
            num /= 10;
        }
    }
}
