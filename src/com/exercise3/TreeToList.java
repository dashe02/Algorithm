package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/3/26.
 */
public class TreeToList {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(5);
        TreeNode ll = new TreeNode(3);
        TreeNode lr = new TreeNode(4);
        TreeNode rr = new TreeNode(6);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.right = rr;
        TreeToList t = new TreeToList();
        t.treeToList(root);
        preOrder(root);
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    /*
    *         1
    *        / \
    *       2   5
    *      /\    \
    *     3  4    6
    */
    private void treeToList(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null) {
            //将左子树接到root的右边
            root.right = left;
            //将右子树接到左子树最右边的叶子节点上
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
            //注意将左子树置空
            root.left = null;
        }
    }
}
