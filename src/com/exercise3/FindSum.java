package com.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/24.
 */
public class FindSum {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        FindSum f = new FindSum();
        f.findSum(array, target);
    }

    private void findSum(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(result, list, array, target, 0);
        System.out.print(result);
    }

    private void help(List<List<Integer>> result, List<Integer> list, int[] array, int target, int pos) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        //int prev = -1;
        for (int i = pos; i < array.length; i++) {
            if (array[i] > target) {
                break;
            }
            /*if (prev == -1 && prev == array[i]) {
                continue;
            }*/
            list.add(array[i]);
            help(result, list, array, target - array[i], i + 1);
            //prev = array[i];
            list.remove(list.size() - 1);
        }

    }
}
