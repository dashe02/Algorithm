package com.exercise7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/13.
 */
public class KSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 10;
        int k = 2;
        //findAll(nums, sum);
        kSum(nums, sum, k);
    }


    private static void kSum(int[] nums, int sum, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helpK(nums, sum, lists, list, k, 0);
        System.out.print(lists);
    }


    private static void helpK(int[] nums, int sum,
                              List<List<Integer>> lists, List<Integer> list,
                              int k, int pos) {
        if (sum == 0 && list.size() == k) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (sum < 0 && list.size() == k) {
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helpK(nums, sum - nums[i], lists, list, k, i + 1);
            list.remove(list.size() - 1);
        }
    }

    private static void findAll(int[] nums, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(nums, sum, lists, list, 0);
        System.out.print(lists);
    }


    private static void help(int[] nums, int sum, List<List<Integer>> lists, List<Integer> list, int pos) {
        if (sum == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (sum < 0) {
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            help(nums, sum - nums[i], lists, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
