package com.test.test.tree;

import com.example.tree.BinaryTree;

/**
 * Created by wecash on 19/3/6.
 */
public class HasSubTree {

    public boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.value == root2.value) {
                result = isEqual(root1, root2);
            }
            if (!result) {
                result = hasSubTree(root1.left, root2);
            }
            if (!result) {
                result = hasSubTree(root1.right, root2);
            }
        }
        return result;
    }

    public boolean isEqual(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.value != root2.value)
            return false;
        return isEqual(root1.left, root2.right) && isEqual(root1.right, root2.right);
    }
}
