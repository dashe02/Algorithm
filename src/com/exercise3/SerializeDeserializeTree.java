package com.exercise3;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/3.
 */
public class SerializeDeserializeTree {

    public int index = -1;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        SerializeDeserializeTree sr = new SerializeDeserializeTree();
        String str = sr.serialize(root);
        System.out.println(str);
        System.out.println("============");
        TreeNode tree = sr.deserialize(str);
        preOrder(tree);
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

    private TreeNode deserialize(String str) {
        index++;
        String[] depStr = str.split(",");
        TreeNode leave = null;
        if (!depStr[index].equals("#")) {
            leave = new TreeNode(Integer.parseInt(depStr[index]));
            leave.left = deserialize(str);
            leave.right = deserialize(str);
        }
        return leave;
    }

    private static void preOrder(TreeNode tree) {
        if (tree == null) return;
        System.out.print(tree.val);
        preOrder(tree.left);
        preOrder(tree.right);
    }
}
