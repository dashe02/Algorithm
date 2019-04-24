package com.exercise8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/4/20.
 */
public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        if (A == null) return -1;
        int n = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer count = map.get(A[i]);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(A[i], count);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3};
        RepeatedNTimes r = new RepeatedNTimes();
        int result = r.repeatedNTimes(A);
        System.out.print(result);
    }
}
