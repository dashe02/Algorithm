package com.exercise.array;

import java.util.*;

/**
 * Created by wecash on 19/3/15.
 * -2 -1 0 0 1 2
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] array = {-1, -2, 0, 0, 1, 2};
        int target = 1;
        ThreeSum t = new ThreeSum();
        //t.threeSum(array, target);
        //t.fourSum(array, target);
        t.twoSum(array, target);
    }

    Map<Integer, Integer> m = new HashMap<>();

    private void twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            map.put(target - array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            Integer index = map.get(array[i]);
            if (index != null && index != i) {
                print(array, i, map);
            }
        }
        //System.out.print(stringSet);
    }


    private void print(int[] array, int i, Map<Integer, Integer> map) {
        Set<String> result = new HashSet<>();
        if (m.get(array[i]) == null) {
            result.add(array[i] + "," + array[map.get(array[i])]);
        }
        m.put(array[map.get(array[i])], array[i]);
        System.out.print(result);
    }


    private void fourSum(int[] array, int target) {
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = array.length - 1; j - i > 2; j--) {
                int start = i + 1;
                int end = j - 1;
                while (start < end) {
                    int sum = array[i] + array[j] + array[start] + array[end];
                    if (sum == target) {
                        System.out.println(array[i] + "===" + array[j] + "===" + array[start] + "===" + array[end]);
                        start++;
                        end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
    }


    private void threeSum(int[] array, int target) {
        for (int i = 0; i < array.length - 2; i++) {
            int start = i + 1;
            int end = array.length - 1;
            while (start < end) {
                int sum = array[i] + array[start] + array[end];
                if (sum == target) {
                    System.out.println(array[i] + "===" + array[start] + "===" + array[end]);
                    start++;
                    end--;
                } else if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
    }


}
