package com.test.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/31.
 */
public class KSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 10;
        int k = 2;
        KSum f = new KSum();
        System.out.print(f.findSum(nums, sum, k));
    }

    private List<List<Integer>> findSum(int[] nums, int sum, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(nums, sum, list, lists, k, 0);
        return lists;
    }


    private void help(int[] nums, int sum, List<Integer> list, List<List<Integer>> lists, int k, int pos) {
        if (list.size() == k && sum == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (list.size() == k || sum < 0) {
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            help(nums, sum - nums[i], list, lists, k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
