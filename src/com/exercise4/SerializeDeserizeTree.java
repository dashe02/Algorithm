package com.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/6.
 */
public class SerializeDeserizeTree {

    int index = -1;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        SerializeDeserizeTree s = new SerializeDeserizeTree();
        String str = s.serialize(root);
        System.out.println(str);
        TreeNode newNode = s.deserize(str);
        preOrder(newNode);
    }


    private static void preOrder(TreeNode newNode) {
        if (newNode == null) return;
        System.out.print(newNode.val);
        preOrder(newNode.left);
        preOrder(newNode.right);
    }

    private TreeNode deserize(String str) {
        index++;
        String[] strings = str.split(",");
        TreeNode treeNode = null;
        if (!strings[index].equals("#")) {
            treeNode = new TreeNode(Integer.parseInt(strings[index]));
            treeNode.left = deserize(str);
            treeNode.right = deserize(str);
        }
        return treeNode;
    }

    private String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }
}
