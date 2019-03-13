package com.exercise.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by wecash on 19/3/13.
 */
public class FindStr {

    public static void main(String[] args) {
        String haystack = "aabaaa";
        String needle = "baa";
        FindStr f = new FindStr();
        int value = f.findStr(haystack, needle);
        System.out.print(value);
    }

    private int findStr(String haystack, String needle) {
        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < chars1.length && j < chars2.length) {
            if (chars1[i] == chars2[j]) {
                list.add(i);
                i++;
                j++;
            } else {
                i++;
            }
        }
        //System.out.print(list);
        if (list.size() == 0) {
            return -1;
        }
        return list.get(0);
    }
}
