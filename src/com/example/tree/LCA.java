package com.example.tree;


import com.test.test.tree.CommonValue;

/**
 * Created by wecash on 19/3/6.
 * 求指定两个节点的最低公共祖先
 */
public class LCA {

    public static void main(String[] args) {
        LCA lca = new LCA();
        BinaryTree root = new BinaryTree(4);
        BinaryTree l = new BinaryTree(2);
        BinaryTree r = new BinaryTree(7);
        BinaryTree ll = new BinaryTree(1);
        BinaryTree lr = new BinaryTree(3);
        /*BinaryTree rl = new BinaryTree(6);
        BinaryTree rr = new BinaryTree(9);*/
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        System.out.print(lca.LCA(root, ll, r).val);
    }

    public BinaryTree LCA(BinaryTree root, BinaryTree node1, BinaryTree node2) {
        if (root == null) return null;
        if (root == node1 || root == node2) return root;
        BinaryTree left = LCA(root.left, node1, node2);
        BinaryTree right = LCA(root.right, node1, node2);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }
}
