package com.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/24.
 */
public class KSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int kk = 3;
        KSum k = new KSum();
        k.ksum(array, target, kk);
    }

    private void ksum(int[] array, int target, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(result, list, array, target, k, 0);
        System.out.print(result);
    }


    private void helper(List<List<Integer>> result, List<Integer> list, int[] array, int target, int k, int pos) {
        if (target == 0 && list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (list.size() == k || target < 0) {
            return;
        }
        //int prev = -1;
        for (int i = pos; i < array.length; i++) {
            if (array[i] > target) {
                break;
            }
            list.add(array[i]);
            helper(result, list, array, target - array[i], k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
