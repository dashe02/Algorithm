package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/22.
 */
public class FindAllSubArray1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        FindAllSubArray1 f = new FindAllSubArray1();
        f.findAllSubArray(array);
    }

    private void findAllSubArray(int[] array) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <= array.length; i++) {
            List<Integer> list = new ArrayList<>();
            subsets(array, 0, i, list, lists);
        }
        lists.add(new ArrayList<>());
        System.out.print(lists);
    }


    private void subsets(int[] array, int s, int w, List<Integer> list, List<List<Integer>> lists) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= array.length - w; ++i) {
            List<Integer> set = new ArrayList<>(list);
            set.add(array[i]);
            subsets(array, i + 1, w - 1, set, lists);
            if (w == 1) {
                lists.add(set);
            }
        }
    }
}
