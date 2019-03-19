package com.exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wecash on 19/3/18.
 */
public class Join {

    public static void main(String[] args) {
        int[] a1 = {4, 9, 5};
        int[] a2 = {9, 4, 9, 8, 4};
        Join j = new Join();
        int[] result = j.join(a1, a2);
        System.out.println(Arrays.toString(result));
    }

    private int[] join(int[] a1, int[] a2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < a1.length; i++) {
            set.add(a1[i]);
        }
        for (int j = 0; j < a2.length; j++) {
            if (set.contains(a2[j])) {
                result.add(a2[j]);
            }
        }
        int[] resultArray = new int[result.size()];
        int k = 0;
        for (Integer r : result) {
            resultArray[k++] = r;
        }
        return resultArray;
    }
}
