package com.exercise.array;

import java.util.*;

/**
 * Created by wecash on 19/3/13.
 */
public class FindFromArray {

    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        int target = 6;
        FindFromArray f = new FindFromArray();
        Set<Integer> indexs = f.findFromArray(array, target);
        System.out.print(indexs);
    }

    private Set<Integer> findFromArray(int[] array, int target) {
        return findFromArray0(array, 0, array.length, target);
    }


    private Set<Integer> findFromArray0(int[] array, int left, int right, int target) {
        Set<Integer> list = new HashSet<>();
        int mid = binaryFind(array, left, right, target);
        if (mid == -1) {
            list.add(-1);
            list.add(-1);
            return list;
        }
        list.add(mid);
        while (array[mid + 1] == target) {
            list.add(mid + 1);
            mid++;
        }
        while (array[mid - 1] == target) {
            list.add(mid - 1);
            mid--;
        }
        return list;
    }

    private int binaryFind(int[] array, int left, int right, int target) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
