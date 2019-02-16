package com.example.tree;

/**
 * Created by wecash on 19/2/16.
 * <p>
 * 1
 * / \
 * 4  5
 * / \ /\
 * 7  0 3 2
 */
public class BinaryTreeTraverse {

    public void preTraverse(BinaryTree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preTraverse(root.left);
        preTraverse(root.right);
    }

    public void midTraverse(BinaryTree root) {
        if (root == null) {
            return;
        }
        midTraverse(root.left);
        System.out.println(root.val);
        midTraverse(root.right);
    }

    public void postTraverse(BinaryTree root) {
        if (root == null) {
            return;
        }
        postTraverse(root.left);
        postTraverse(root.right);
        System.out.println(root.val);
    }


    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        BinaryTree l1 = new BinaryTree(4);
        BinaryTree r1 = new BinaryTree(5);
        BinaryTree ll1 = new BinaryTree(7);
        BinaryTree lr1 = new BinaryTree(0);
        BinaryTree rl1 = new BinaryTree(3);
        BinaryTree rr1 = new BinaryTree(2);
        root.left = l1;
        root.right = r1;
        l1.left = ll1;
        l1.right = lr1;
        r1.left = rl1;
        r1.right = rr1;
        BinaryTreeTraverse treeTraverse = new BinaryTreeTraverse();
        treeTraverse.preTraverse(root);
        System.out.println("====================");
        treeTraverse.midTraverse(root);
        System.out.println("====================");
        treeTraverse.postTraverse(root);
    }
}


