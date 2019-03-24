package com.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/3/23.
 */
public class FourSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        int target = 10;
        FourSum f = new FourSum();
        f.fourSum(array, target);
    }

    private void fourSum(int[] array, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = array.length - 1; j > 2; j--) {
                int start = i + 1;
                int end = j - 1;
                while (start < end) {
                    int temp = array[i] + array[j] + array[start] + array[end];
                    if (temp == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(array[i]);
                        list.add(array[j]);
                        list.add(array[start]);
                        list.add(array[end]);
                        lists.add(list);
                        start++;
                        end--;
                    } else if (temp > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        System.out.print(lists);
    }
}
