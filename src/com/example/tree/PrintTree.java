package com.example.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wecash on 19/3/6.
 */
public class PrintTree {

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        BinaryTree l = new BinaryTree(2);
        BinaryTree r = new BinaryTree(3);
        BinaryTree ll = new BinaryTree(4);
        BinaryTree lr = new BinaryTree(5);
        BinaryTree rl = new BinaryTree(6);
        BinaryTree rr = new BinaryTree(7);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        PrintTree p = new PrintTree();
        //p.printTree(root);
        List<List<Integer>> lists = new ArrayList<>();
        p.printTree1(root,lists,0);
        System.out.print(lists);
    }

    private void printTree(BinaryTree root) {
        if (root == null) return;
        Stack<BinaryTree> stack = new Stack<>();
        Stack<BinaryTree> stack2 = new Stack<>();
        boolean isReverse = false;
        stack.add(root);
        while (!stack.isEmpty() || !stack2.isEmpty()) {
            if (!isReverse) {
                while (!stack.isEmpty()) {
                    BinaryTree node = stack.pop();
                    System.out.print(node.val + " ");
                    if (node.left != null) {
                        stack2.push(node.left);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                }
                isReverse = true;
            } else {
                while (!stack2.isEmpty()) {
                    BinaryTree node = stack2.pop();
                    System.out.print(node.val + " ");
                    if (node.right != null) {
                        stack.push(node.right);
                    }
                    if (node.left != null) {
                        stack.push(node.left);
                    }
                }
                isReverse = false;
            }
        }

    }

    public void printTree1(BinaryTree root, List<List<Integer>> lists, int level) {
        if (root == null) return;
        if (lists.size() <= level) lists.add(new LinkedList<>());
        if (level % 2 == 0) lists.get(level).add(root.val);
        else lists.get(level).add(0, root.val);
        printTree1(root.left, lists, level + 1);
        printTree1(root.right, lists, level + 1);
    }
}
