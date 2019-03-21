package com.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/20.
 */
public class FindAllSubArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        FindAllSubArray f = new FindAllSubArray();
        List<List<Integer>> reuslt = f.findAllSubArray(array);
        System.out.print(reuslt);
    }

    private List<List<Integer>> findAllSubArray(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= array.length; i++) {
            List<Integer> list = new ArrayList<>();
            subset(array, 0, i, list, result);
        }
        result.add(new ArrayList<>());
        return result;
    }

    private void subset(int[] array, int s, int w, List<Integer> list, List<List<Integer>> result) {
        if (w == 0) {
            return;
        }
        for (int i = s; i <= array.length - w; ++i) {
            List<Integer> set = new ArrayList<>(list);
            set.add(array[i]);
            subset(array, i + 1, w - 1, set, result);
            if (w == 1) {
                result.add(set);
            }
        }
    }
}
