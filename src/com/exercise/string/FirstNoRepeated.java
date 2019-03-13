package com.exercise.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by wecash on 19/3/13.
 */
public class FirstNoRepeated {

    public static void main(String[] args) {
        String str = "leetcode";
        FirstNoRepeated f = new FirstNoRepeated();
        System.out.print(f.firstNoRepeated(str));
    }

    private String firstNoRepeated(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer count = map.get(chars[i]);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(chars[i], count);
        }
        for (Map.Entry entry : map.entrySet()) {
            Integer count = (Integer) entry.getValue();
            if (count == 1) {
                return entry.getKey().toString();
            }
        }
        return null;
    }
}
