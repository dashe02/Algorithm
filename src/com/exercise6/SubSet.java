package com.exercise6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/11.
 */
public class SubSet {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        subSet(nums);
    }

    private static void subSet(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            help(nums, 0, i, lists, list);
        }
        lists.add(new ArrayList<>());
        System.out.println(lists);
    }


    private static void help(int[] nums, int s, int w, List<List<Integer>> lists, List<Integer> list) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= nums.length - w; i++) {
            List<Integer> set = new ArrayList<>(list);
            set.add(nums[i]);
            help(nums, i + 1, w - 1, lists, set);
            if (w == 1) {
                lists.add(new ArrayList<>(set));
            }
        }
    }
}
