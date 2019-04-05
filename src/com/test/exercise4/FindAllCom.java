package com.test.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/4.
 */
public class FindAllCom {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 10;
        FindAllCom f = new FindAllCom();
        f.findAllCom(nums, sum);
    }

    private void findAllCom(int[] nums, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(nums, sum, lists, list, 0);
        System.out.print(lists);
    }


    private void help(int[] nums, int sum, List<List<Integer>> lists, List<Integer> list, int pos) {
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
