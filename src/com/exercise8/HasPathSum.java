package com.exercise8;

import com.exercise.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/21.
 */
public class HasPathSum {

    List<List<Integer>> pathList = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public boolean hasPathSum(TreeNode root, int sum) {
        return help(root, sum).size() > 0;
    }


    private List<List<Integer>> help(TreeNode root, int sum) {
        if (root == null) return pathList;
        path.add(root.val);
        sum = sum - root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            pathList.add(new ArrayList<>(path));
            return pathList;
        }
        help(root.left, sum);
        help(root.right, sum);
        path.remove(path.size() - 1);
        return pathList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode l = new TreeNode(4);
        TreeNode r = new TreeNode(8);
        TreeNode ll = new TreeNode(11);
        TreeNode rl = new TreeNode(13);
        TreeNode rr = new TreeNode(4);
        TreeNode lll = new TreeNode(7);
        TreeNode llr = new TreeNode(2);
        TreeNode rrr = new TreeNode(1);
        root.left = l;
        root.right = r;
        l.left = ll;
        r.left = rl;
        r.right = rr;
        ll.left = lll;
        ll.right = llr;
        rr.right = rrr;
        int sum = 22;
        HasPathSum h = new HasPathSum();
        System.out.print(h.hasPathSum(root, sum));
    }
}
