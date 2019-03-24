package com.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/23.
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        int target = 10;
        ThreeSum t = new ThreeSum();
        t.threeSum(array, target);
    }

    private void threeSum(int[] array, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int temp = array[i] + array[left] + array[right];
                if (temp == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(array[i]);
                    list.add(array[left]);
                    list.add(array[right]);
                    lists.add(list);
                    left++;
                    right--;
                } else if (temp > target) {
                    right--;
                } else if (temp < target) {
                    left++;
                }
            }
        }
        System.out.print(lists);
    }
}
