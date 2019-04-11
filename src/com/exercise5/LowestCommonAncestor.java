package com.exercise5;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;
import com.test.exercise.Tree;

/**
 * Created by wecash on 19/4/11.
 * 给定一棵二叉树，找出树中两个给定节点的最低公共祖先(LCA)
 * 根据Wikipedia对LCA的定义:“在两个节点p和q之间定义的最低公共祖先是
 * T中同时具有p和q作为后代的最低节点(在这里，我们允许一个节点作为其自身的后代)。
 * <p>
 * 与找二叉搜索树的最近公共祖先类似，
 * 如果一个节点的左子树上有与p或q相等的节点且右子树上有与p或q相等的节点，说明此时该节点即为最近公共节点
 */
public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(5);
        TreeNode treeNode = lowestCommonAncestor0(root, p, q);
        System.out.print(treeNode.val);
    }

    private static TreeNode lowestCommonAncestor0(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        //去该节点的左子树上去找
        TreeNode left = lowestCommonAncestor0(root.left, p, q);
        //去该节点的右子树上去找
        TreeNode right = lowestCommonAncestor0(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
