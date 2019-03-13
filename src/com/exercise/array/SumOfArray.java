package com.exercise.array;

import java.util.*;

/**
 * Created by wecash on 19/3/13.
 * <p>
 * -2 -1 0 0 1 2
 * <p>
 * <p>
 * 1 0 -1 0
 * 0 0 -2 2
 * 1 -1 -2 2
 */
public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {1, 0, -1, 0, -2, 2};
        int target = 0;
        Arrays.sort(array);
        SumOfArray s = new SumOfArray();
        s.sumOfArray(array, target);
    }

    private void sumOfArray(int[] array, int sum) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int begin = 0; begin < array.length - 3; begin++) {
            for (int end = array.length - 1; end - begin > 2; end--) {
                int left = begin + 1;
                int right = end - 1;
                while (left < right) {
                    int tempSum = array[begin] + array[end] + array[left] + array[right];
                    if (tempSum == sum) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(array[begin]);
                        temp.add(array[end]);
                        temp.add(array[left]);
                        temp.add(array[right]);
                        set.add(temp);
                        left++;
                    } else if (tempSum < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        for (List<Integer> list : set) {
            result.add(list);
        }
        System.out.print(result);
    }

}



