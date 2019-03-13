package com.example.tree;

/**
 * Created by wecash on 19/3/11.
 * 1
 * / \
 * 2  3
 * /\  /\
 * 4 5 6 7
 */
public class DuichengTree {

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        BinaryTree l = new BinaryTree(2);
        BinaryTree r = new BinaryTree(2);
        BinaryTree ll = new BinaryTree(3);
        BinaryTree lr = new BinaryTree(4);
        BinaryTree rl = new BinaryTree(4);
        BinaryTree rr = new BinaryTree(3);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        DuichengTree tree = new DuichengTree();
        System.out.print(tree.duichengTree(root));
    }

    private boolean duichengTree(BinaryTree root) {
        if (root == null) return false;
        BinaryTree temp = root;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        preOrder(temp, sb);
        reverseTree1(root);
        preOrder(root, sb1);
        return sb.toString().endsWith(sb1.toString());
    }

    private void preOrder(BinaryTree root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val);
        preOrder(root.left, sb);
        preOrder(root.right, sb);
    }

    private void reverseTree1(BinaryTree root) {
        if (root == null) return;
        BinaryTree left = root.left;
        BinaryTree right = root.right;
        swap(root);
        reverseTree1(left);
        reverseTree1(right);
    }

    private void swap(BinaryTree root) {
        BinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
