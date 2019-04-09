package com.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/6.
 */
public class Subset {

    public static void main(String[] args) {
        String[] nums = {"a", "b", "c"};
        Subset s = new Subset();
        s.subset(nums);
    }

    private void subset(String[] nums) {
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            List<String> list = new ArrayList<>();
            help(nums, 0, i, lists, list);
        }
        lists.add(new ArrayList<>());
        System.out.print(lists);
    }


    private void help(String[] nums, int s, int w, List<List<String>> lists, List<String> list) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= nums.length - w; i++) {
            List<String> set = new ArrayList<>(list);
            set.add(nums[i]);
            help(nums, i + 1, w - 1, lists, set);
            if (w == 1) {
                lists.add(set);
            }
        }
    }
}
