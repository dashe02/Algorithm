package com.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wecash on 19/3/20.
 */
public class SubArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        SubArray s = new SubArray();
        System.out.print(s.subsets(array));
    }

    // 1  2  3
    // 12 13 23
    // 123
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            subsets(nums, 0, i, list, lists);
        }
        lists.add(new ArrayList<>());
        return lists;
    }

    private void subsets(int[] nums, int s, int w, List<Integer> list, List<List<Integer>> lists) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= nums.length - w; ++i) {
            List<Integer> set = new ArrayList<>(list);
            set.add(nums[i]);
            subsets(nums, i + 1, w - 1, set, lists);
            if (1 == w) {
                lists.add(set);
            }
        }
    }

}
