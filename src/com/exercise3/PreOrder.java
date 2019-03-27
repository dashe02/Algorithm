package com.exercise3;

/**
 * Created by wecash on 19/3/25.
 */
public class PreOrder {
    public static void main(String[] args) {
        String[] preOrder = {"9", "3", "4", "#", "#", "1", "#", "#", "2", "#", "6", "#", "#"};
        PreOrder p = new PreOrder();
        System.out.print(p.isPreOrder(preOrder));
    }

    private boolean isPreOrder(String[] preOrder) {
        int diff = 1;
        for (String node : preOrder) {
            if (--diff < 0) return false;
            if (!node.equals("#")) diff += 2;
        }
        return diff == 0;
    }
}
