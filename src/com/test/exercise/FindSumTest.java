package com.test.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/25.
 */
public class FindSumTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        FindSumTest f = new FindSumTest();
        f.findSumTest(array, target);
    }

    private void findSumTest(int[] array, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(res, list, array, target, 0);
        System.out.println(res);
    }


    private void helper(List<List<Integer>> res, List<Integer> list, int[] array, int target, int pos) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        int prev = -1;
        for (int i = pos; i < array.length; i++) {
            if (array[i] > target) {
                break;
            }
            if (prev == -1 && prev == array[i]) {
                continue;
            }
            list.add(array[i]);
            helper(res, list, array, target - array[i], i + 1);
            prev = array[i];
            list.remove(list.size() - 1);
        }
    }
}
