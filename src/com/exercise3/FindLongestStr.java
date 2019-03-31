package com.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/30.
 */
public class FindLongestStr {

    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 2};
        FindLongestStr f = new FindLongestStr();
        f.findLongestStr(nums, 0, 1, new ArrayList<>());
        System.out.print(lists);
    }

    private void findLongestStr(int[] nums, int i, int j, List<Integer> list) {
        if (i == nums.length || j == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (nums[i] < nums[j]) {
            list.add(nums[i]);
            list.add(nums[j]);
            //正常继续
            findLongestStr(nums, j + 1, j + 2, list);
        } else if (nums[i] == nums[j]) {
            findLongestStr(nums, i + 1, j + 1, list);
        } else if (nums[i] > nums[j]) {
            findLongestStr(nums, i, j + 1, list);
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            findLongestStr(nums, j, j + 1, list);
        }
    }
}
