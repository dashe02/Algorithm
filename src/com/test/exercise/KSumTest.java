package com.test.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/25.
 */
public class KSumTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int k = 5;
        KSumTest f = new KSumTest();
        f.findSumTest(array, target, k);
    }

    private void findSumTest(int[] array, int target, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(res, list, array, target, k, 0);
        System.out.println(res);
    }


    private void helper(List<List<Integer>> res, List<Integer> list, int[] array, int target, int k, int pos) {
        if (list.size() == k && target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (list.size() == k || target < 0) {
            return;
        }
        for (int i = pos; i < array.length; i++) {
            if (array[i] > target) {
                break;
            }
            list.add(array[i]);
            helper(res, list, array, target - array[i], k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
