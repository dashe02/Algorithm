package com.exercise8;

import com.exercise.tree.TreeNode;

import java.util.*;

/**
 * Created by wecash on 19/4/15.
 */
public class FindMode {

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        //System.out.print(list);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer a : list) {
            Integer count = map.get(a);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(a, count);
        }
        List<Map.Entry<Integer, Integer>> sortList = new ArrayList<>(map.entrySet());
        Collections.sort(sortList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        List<Integer> result = new ArrayList<>();
        if (sortList.size() > 0) {
            int max = sortList.get(sortList.size() - 1).getValue();
            result.add(sortList.get(sortList.size() - 1).getKey());
            for (int i = sortList.size() - 2; i >= 0; i--) {
                if (sortList.get(i).getValue() == max) {
                    result.add(sortList.get(i).getKey());
                }
            }
        }
        int[] rArray = new int[result.size()];
        int k = 0;
        for (Integer i : result) {
            rArray[k++] = i;
        }
        return rArray;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        preOrder(root.left, list);
        list.add(root.val);
        preOrder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2147483647);
        //TreeNode r = new TreeNode(2);
        //TreeNode rl = new TreeNode(2);
        //root.right = r;
        //r.left = rl;
        FindMode f = new FindMode();
        int[] result = f.findMode(root);
        System.out.print(Arrays.toString(result));
    }
}
