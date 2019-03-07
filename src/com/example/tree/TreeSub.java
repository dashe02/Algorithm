package com.example.tree;

/**
 * Created by wecash on 19/3/6.
 */
public class TreeSub {

    public static void main(String[] args) {

    }

    public boolean hasSubTree(BinaryTree root1, BinaryTree root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                //若两个树的根节点相同,则只需要比较两个树是否相等
                result = isEqualTo(root1, root2);
            }
            if (!result) {
                result = hasSubTree(root1.right, root2);
            }
            if (!result) {
                result = hasSubTree(root1.left, root2);
            }
        }
        return result;
    }

    public boolean isEqualTo(BinaryTree node1, BinaryTree node2) {
        if (node2 == null)
            return true;
        if (node1 == null)
            return false;
        if (node1.val != node2.val)
            return false;
        return isEqualTo(node1.left, node1.right) && isEqualTo(node1.right, node2.right);

    }

}
