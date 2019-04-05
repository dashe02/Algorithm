package com.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/4.
 */
public class FinSubSet {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        FinSubSet f = new FinSubSet();
        f.findSubSet(nums);
    }

    private void findSubSet(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            subset(nums, 0, i, lists, list);
        }
        lists.add(new ArrayList<>());
    }


    private void subset(int[] nums, int s, int w, List<List<Integer>> lists, List<Integer> list) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= nums.length - w; i++) {
            List<Integer> set = new ArrayList<>(list);
            set.add(nums[i]);
            subset(nums, i + 1, w - 1, lists, set);
            if (w == 1) {
                lists.add(set);
            }
        }
    }
}
