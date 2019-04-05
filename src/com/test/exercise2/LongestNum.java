package com.test.exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by wecash on 19/4/1.
 */
public class LongestNum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 2, 5, 8, 0, 3, 6, 9};
        LongestNum l = new LongestNum();
        String max = l.longestNum(nums);
        System.out.print(max);
    }

    private String longestNum(int[] nums) {
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
