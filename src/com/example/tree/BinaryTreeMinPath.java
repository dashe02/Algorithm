package com.example.tree;

/**
 * Created by wecash on 19/2/21.
 */
public class BinaryTreeMinPath {

    public int run(BinaryTree root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return run(root.right) + 1;
        else if (root.right == null) return run(root.left) + 1;
        else return Math.min(run(root.left), run(root.right)) + 1;
    }

    public static void main(String[] args) {
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
        /*r.left = rl;
        r.right = rr;*/
        BinaryTreeMinPath p = new BinaryTreeMinPath();
        System.out.println(p.run(root));
    }
}
