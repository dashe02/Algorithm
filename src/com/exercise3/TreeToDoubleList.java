package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/27.
 */
public class TreeToDoubleList {

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        TreeToDoubleList t = new TreeToDoubleList();
        List<Integer> list = new ArrayList<>();
        t.treeToDoubleList(root, list);
        //System.out.print(list);
        DNode head = new DNode(0);
        DNode tt = head;
        for (Integer n : list) {
            DNode temp = new DNode(n);
            tt.next = temp;
            temp.prev = tt;
            tt = tt.next;
        }
        tt.next = head;
        head.prev = tt;
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }

    private void treeToDoubleList(TreeNode root, List<Integer> list) {

        if (root == null) return;
        treeToDoubleList(root.left, list);
        //head->node
        //head<-node
        list.add(root.val);
        treeToDoubleList(root.right, list);
    }
}

class DNode {
    int val;
    DNode prev;
    DNode next;

    public DNode(int val) {
        this.val = val;
    }
}
