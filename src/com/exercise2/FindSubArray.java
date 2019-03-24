package com.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/23.
 */
public class FindSubArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        FindSubArray f = new FindSubArray();
        f.findSubArray(array);
    }

    private void findSubArray(int[] array) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <= array.length; i++) {
            List<Integer> list = new ArrayList<>();
            subsets(0, i, array, list, lists);
        }
        lists.add(new ArrayList<>());
        System.out.print(lists);
    }

    private void subsets(int s, int w, int[] array, List<Integer> list, List<List<Integer>> lists) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= array.length - w; i++) {
            List<Integer> set = new ArrayList<>(list);
            set.add(array[i]);
            subsets(i + 1, w - 1, array, set, lists);
            if (w == 1) {
                lists.add(set);
            }
        }
    }
}
