package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/20.
 */
public class FindAllSubA {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        FindAllSubA f = new FindAllSubA();
        System.out.print(f.findAllSubA(nums));
    }

    private List<List<Integer>> findAllSubA(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            subset(nums, 0, i, list, lists);
        }
        lists.add(new ArrayList<>());
        return lists;
    }


    private void subset(int[] nums, int s, int w, List<Integer> list, List<List<Integer>> lists) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= nums.length - w; ++i) {
            List<Integer> set = new ArrayList<>(list);
            set.add(nums[i]);
            subset(nums, i + 1, w - 1, set, lists);
            if (w == 1) {
                lists.add(set);
            }
        }
    }
}
