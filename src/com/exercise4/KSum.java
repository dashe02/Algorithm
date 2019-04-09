package com.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/6.
 */
public class KSum {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int k = 1;
        KSum ksum = new KSum();
        //ksum.ksum(nums, target);
        ksum.ksumK(nums, target, k);
    }


    private void ksumK(int[] nums, int target, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helpk(nums, target, lists, list, 0, k);
        System.out.print(lists);
    }


    private void helpk(int[] nums, int target,
                       List<List<Integer>> lists, List<Integer> list, int pos, int k) {
        if (target == 0 && list.size() == k) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 && list.size() == k) {
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helpk(nums, target - nums[i], lists, list, i + 1, k);
            list.remove(list.size() - 1);
        }

    }

    private void ksum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(nums, target, lists, list, 0);
        System.out.print(lists);
    }


    private void help(int[] nums, int target, List<List<Integer>> lists, List<Integer> list, int pos) {
        if (target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            help(nums, target - nums[i], lists, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
