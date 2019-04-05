package com.test.exercise4;

import com.exercise.tree.CommonTree;
import com.exercise.tree.TreeNode;

/**
 * Created by wecash on 19/4/4.
 */
public class SerializeDeserializeTree {

    int index = -1;

    public static void main(String[] args) {
        TreeNode root = CommonTree.createTree();
        SerializeDeserializeTree s = new SerializeDeserializeTree();
        String str = s.serialize(root);
        System.out.println(str);
        TreeNode newNode = s.deserialize(str);
        preOrder(newNode);
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
        String[] strings = str.split(",");
        TreeNode leave = null;
        if (!strings[index].equals("#")) {
            leave = new TreeNode(Integer.parseInt(strings[index]));
            leave.left = deserialize(str);
            leave.right = deserialize(str);
        }
        return leave;
    }

    private static void preOrder(TreeNode newNode) {
        if (newNode == null) return;
        System.out.print(newNode.val);
        preOrder(newNode.left);
        preOrder(newNode.right);
    }
}
