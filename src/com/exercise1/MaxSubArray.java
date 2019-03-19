package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/19.
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] a = {1, -1, 2, -2, -3, -3, 4};
        MaxSubArray m = new MaxSubArray();
        int length = m.maxSubArray(a);
        System.out.print(length);
    }

    private int maxSubArray(int[] a) {
        int len = 1;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            int temp = 1;
            List<Integer> list = new ArrayList<>();
            list.add(a[i]);
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    list.add(a[j]);
                    temp++;
                }
            }
            if (len < temp) {
                len = temp;
            }
            lists.add(list);
        }
        System.out.print(lists);
        return len;
    }
}
